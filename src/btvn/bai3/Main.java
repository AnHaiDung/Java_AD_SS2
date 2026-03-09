package btvn.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Authenticatable pass = new Pass("12345678");
        if (pass.isAuthenticated()){
            System.out.println("khong duoc de trong");
        } else {
            String encrypted = Authenticatable.encrypt(pass.getPassword());
            System.out.println(encrypted);
        }
    }
}
