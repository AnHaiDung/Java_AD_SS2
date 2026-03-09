package functional;

public interface IColorable {
    String RED = "abc";
    void printColor(String color);
//    JAVA 8
    default void draw(){ // khong bat buoc lop con phai ghi de
        System.out.println("to mau");
    }

    default void saw(){

    }
    static void erase(){ // thuoc ve interface va không kế thừa

    }
//    JAVA 9
    private void toStr(){ // chỉ cho phép truy cập nội bộ trong interface

    }

}
