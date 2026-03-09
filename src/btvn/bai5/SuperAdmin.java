package btvn.bai5;

import java.util.Scanner;

public class SuperAdmin implements IAdminActions,IUserActions{
    @Override
    public void logActivity(String activity) {
        IAdminActions.super.logActivity(activity);
        IUserActions.super.logActivity(activity);
    }
}
