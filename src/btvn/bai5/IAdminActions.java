package btvn.bai5;

public interface IAdminActions {
    default void logActivity(String activity){
        System.out.println("admin do : " + activity);
    }
}
