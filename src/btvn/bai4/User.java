package btvn.bai4;

import java.util.Scanner;

public class User {
    private String username;
    public User(){
        this.username = "User";
    }
    public User(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
}
