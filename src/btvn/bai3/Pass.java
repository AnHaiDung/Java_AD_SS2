package btvn.bai3;

import java.util.Scanner;

public class Pass implements Authenticatable{
    private String password;

    public Pass(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
