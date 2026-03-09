package btvn.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PasswordValidator lb = password -> password.length() >= 8;

        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        System.out.println(lb.isValid(password));

    }
}
