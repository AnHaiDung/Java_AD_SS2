package methodreferences;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Tham chiếu của 1 phương thức
//        Duyệt qua 1 ds tên hs và in
        List<String> names = Arrays.asList("Nam", "Sơn","Hà");
        for (String name : names){
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        names.forEach(s -> System.out.println(s)); // lambda
        names.forEach(Printer::print);// thay thế lambda

//        Cách sửa dụng
        /*
        ClassName :: method
        objName :: method
        ClassName :: new (hàm tạo)
         */
//        Bien doi thanh danh sach student
//        s -> new Student(s)
//        Student::new
        List<Student> studentList = names.stream()
                .map( Student::new)
                .toList();
        System.out.println(studentList);
//        Lọc ra những sv trong tên có chữ H
        for (Student s: studentList){
            if (s.getName().contains("h")){
                System.out.println(s);
            }
        }

        studentList.stream().filter(student -> student.getName().contains("H")).forEach(System.out::println);
        studentList.stream().filter(student -> student.getName().contains("n"))
                .sorted(Comparator.comparing(Student::getName).reversed())
                .forEach(System.out::println);
//        4 phuong thuc co ban: map, filter, foreach, reduce( tich luy) (chi co foreach dung de in)
        Random rad = new Random();
        List<Integer> integers = Stream.generate(()-> rad.nextInt(100))
                .limit(20)
                .toList();
//        forEach
        integers.forEach(a -> System.out.println(a));// Consumer
//        filter
        integers.stream().filter(a -> a%3 == 0)
                .forEach(a -> System.out.println(a));// Predicate
//        map
        integers.stream().map(a-> Math.pow(a,3))
                .forEach(a -> System.out.println(a));// Function
//        reduce
        long total = integers.stream().reduce(0, (a,b)->a+b);
        System.out.println(total);
    }
}
