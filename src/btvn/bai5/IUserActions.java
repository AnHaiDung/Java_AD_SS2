package btvn.bai5;

public interface IUserActions {
    default void logActivity(String activity){
        System.out.println("user do : " + activity);
    }}
