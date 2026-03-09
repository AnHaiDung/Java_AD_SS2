package btvn.bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<User> userFactory = User::new;

        List<User> users = new ArrayList<>();
        users.add(new User("Dung"));
        users.add(new User("Hon Lo"));

        users.stream().map(User::getUsername).forEach(System.out::println);
    }
}
