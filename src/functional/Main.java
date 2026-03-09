package functional;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        IColorable obj = new Shape();
        obj.draw();
        obj.saw();
        obj.printColor("red");
        IColorable.erase();

//        FC interface dựng sẵn
//        Consumer (nhan vao 1 dt de xu ly va khong tra ve gi)
//        Predicate ( ktra va tra ve gia tri dung sai)
//        Function (nhan vao kieu du lieu nay va tra 1 kieu du lieu khac)
//        Supplier (khong nhan vao gi nhung tra ve gia tri T) ( vidu: tao so randoom)

//        Lambda expression: cú phap viet gọn cua 1 method dung de tao nhanh doi tuong tu Fc interface
        IFunctional lb = (a,b) -> {return 1;};
        IFunctional lb2 = (a,b) -> 1;
//        Trc Java 8
//        IFunctional i1 = new Cat();
//        IFunctional i2 = new IFunctional() { // lớp không tên
//            @Override
//            public void save() {
//
//            }
//        };
        Comparator<Cat> com1 = (c1,c2) -> -1;
        Comparator<Cat> com2 = (c2,c1) -> 1;
        Collections.sort(new ArrayList<>(),(o1, o2) -> 1);

        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).map(value -> value*value).forEach(t -> System.out.println(t));
    }
}
