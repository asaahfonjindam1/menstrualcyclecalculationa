package com.example.menstrualcyclecalculationa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomePage extends Activity  {
    private ImageButton logoutBtn;
    private TextView Uname;
    private ImageView UImage;
    private LinearLayout manageCar,settings,viewOrder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        Uname = findViewById(R.id.uname);
        UImage = findViewById(R.id.user_image);
        RadioButton shortCourt = findViewById(R.id.short_court);
        RadioButton regularCourt = findViewById(R.id.regular_court);
        RadioButton longCourt = findViewById(R.id.long_court);
        Button subBtn = findViewById(R.id.submit_button);
        TextView ovulationDate = findViewById(R.id.ovulation_date);
        TextView lastDate = findViewById(R.id.last_day);
        TextView nextCycle = findViewById(R.id.next_cycle);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("name")) {
            String name = intent.getStringExtra("name");
            String image = intent.getStringExtra("imageResourceId");
            int imageResourceId = Integer.parseInt(image);

            // Update UI elements with car data (replace with your logic)
            Uname.setText(name);
            UImage.setImageResource(imageResourceId); // Example for a specific car image
        }

        subBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                boolean isClicked1 = shortCourt.isChecked();
                boolean isClicked2 = regularCourt.isChecked();
                boolean isClicked3 = longCourt.isChecked();
                EditText firstDateEditText = findViewById(R.id.first_date);

                String dateString = firstDateEditText.getText().toString();

// Handle empty or invalid date string (optional)
                if (dateString.isEmpty()) {
                    // Display an error message to the user
                    Toast.makeText(HomePage.this, "Rent button clicked!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (isClicked1) {
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust based on your date format
                        Date date = dateFormat.parse(dateString);

                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        calendar.add(Calendar.DAY_OF_MONTH, 12); // Change to 20 for adding 20 days

                        // Optional: Format the new date
                        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Change format as needed
                        ovulationDate.setText(newDateFormat.format(calendar.getTime()));
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date);
                        calendar2.add(Calendar.DAY_OF_MONTH, 5); // Change to 20 for adding 20 days

                        // Optional: Format the new date
                        SimpleDateFormat newDateFormat2 = new SimpleDateFormat("dd/MM/yyyy"); // Change format as needed
                        lastDate.setText(newDateFormat2.format(calendar.getTime()));
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTime(date);
                        calendar3.add(Calendar.DAY_OF_MONTH, 24); // Change to 20 for adding 20 days

                        // Optional: Format the new date
                        SimpleDateFormat newDateFormat3 = new SimpleDateFormat("dd/MM/yyyy"); // Change format as needed
                        nextCycle.setText(newDateFormat3.format(calendar.getTime()));
                    } catch (ParseException e) {
                        // Handle parsing exception
                        e.printStackTrace();
                        // Display an error message to the user
                    }
                }
                if (isClicked2) {
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust based on your date format
                        Date date = dateFormat.parse(dateString);

                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        calendar.add(Calendar.DAY_OF_MONTH, 14); // Change to 20 for adding 20 days

                        // Optional: Format the new date
                        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Change format as needed
                        ovulationDate.setText(newDateFormat.format(calendar.getTime()));
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date);
                        calendar2.add(Calendar.DAY_OF_MONTH, 5); // Change to 20 for adding 20 days

                        // Optional: Format the new date
                        SimpleDateFormat newDateFormat2 = new SimpleDateFormat("dd/MM/yyyy"); // Change format as needed
                        lastDate.setText(newDateFormat2.format(calendar.getTime()));
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTime(date);
                        calendar3.add(Calendar.DAY_OF_MONTH, 28); // Change to 20 for adding 20 days

                        // Optional: Format the new date
                        SimpleDateFormat newDateFormat3 = new SimpleDateFormat("dd/MM/yyyy"); // Change format as needed
                        nextCycle.setText(newDateFormat3.format(calendar.getTime()));
                    } catch (ParseException e) {
                        // Handle parsing exception
                        e.printStackTrace();
                        // Display an error message to the user
                    }
                }
                if (isClicked3) {
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust based on your date format
                        Date date = dateFormat.parse(dateString);

                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(date);
                        calendar.add(Calendar.DAY_OF_MONTH, 15); // Change to 20 for adding 20 days

                        // Optional: Format the new date
                        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Change format as needed
                        ovulationDate.setText(newDateFormat.format(calendar.getTime()));
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date);
                        calendar2.add(Calendar.DAY_OF_MONTH, 5); // Change to 20 for adding 20 days

                        // Optional: Format the new date
                        SimpleDateFormat newDateFormat2 = new SimpleDateFormat("dd/MM/yyyy"); // Change format as needed
                        lastDate.setText(newDateFormat2.format(calendar.getTime()));
                        Calendar calendar3 = Calendar.getInstance();
                        calendar3.setTime(date);
                        calendar3.add(Calendar.DAY_OF_MONTH, 30); // Change to 20 for adding 20 days

                        // Optional: Format the new date
                        SimpleDateFormat newDateFormat3 = new SimpleDateFormat("dd/MM/yyyy"); // Change format as needed
                        nextCycle.setText(newDateFormat3.format(calendar.getTime()));
                    } catch (ParseException e) {
                        // Handle parsing exception
                        e.printStackTrace();
                        // Display an error message to the user
                    }
                }

            }
        });
        shortCourt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                regularCourt.setChecked(false);
                longCourt.setChecked(false);
            }
        });
        regularCourt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                shortCourt.setChecked(false);
                longCourt.setChecked(false);
            }
        });
        longCourt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                regularCourt.setChecked(false);
                shortCourt.setChecked(false);
            }
        });

    }

}
