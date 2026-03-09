package btvn.bai3;

public interface Authenticatable {
    String getPassword();

    default boolean isAuthenticated(){
        if (getPassword().isEmpty()){
            return true;
        }
        return false;
    }

    static String encrypt(String rawPassword) {
        return "ABC_" + rawPassword;
    }

}
