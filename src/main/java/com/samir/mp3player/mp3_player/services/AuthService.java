package com.samir.mp3player.mp3_player.services;

public class AuthService {
    // function to check username and password
    public boolean checkCredentials(String username, String password) {
        return username.equals("Samir") && password.equals("Samir121416");
    }
}
