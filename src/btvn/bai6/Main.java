package btvn.bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("dung");
        UserProcessor upName = UserUtils::convertToUpperCase;
        System.out.println(upName.process(user));
    }
}
