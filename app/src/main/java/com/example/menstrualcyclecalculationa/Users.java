package com.example.menstrualcyclecalculationa;

import java.util.ArrayList;

public class Users {
    public String name;
    public String email;
    public String password;
    public String phone;
    public int imageResourceId;

    public Users(String name, String email, String password,
                 String phone, int imageResourceId ) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.imageResourceId = imageResourceId;
    }
    public static Users loginMethod(String creds,String password, ArrayList<Users> users) {
        Users userCurrent;
        for (Users user : users) {
            if ( ( (user.name.equalsIgnoreCase(creds)||user.email.equalsIgnoreCase(creds) ) && user.password.equalsIgnoreCase(password))) {
                return user;
            }
        }
        return null;
    }
    public static ArrayList<Users> sampleUsers() {
        ArrayList<Users> users = new ArrayList<>();

        users.add(new Users("shooter",  "shooter@gmail.com", "12345", "+1234567890", R.drawable.p1));
        users.add(new Users("Julienne", "Juliennengan96@gmail.com", "123", "+9876543210", R.drawable.p1));
        users.add(new Users("Test",  "test@example.com", "welcome123", "+5432198760", R.drawable.p1));

        return users;
    }
}
