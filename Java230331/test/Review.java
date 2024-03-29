package Java230331.test;

class Person {
    void speak() {
        System.out.println("speak() 메소드 선언");
    }
}

class Student extends Person {
    @Override
    void speak() {
        System.out.println("학생 speak() 메소드 선언");
    }
}

class GraduateStudent extends Person {
    @Override
    void speak() {
        System.out.println("대학원생 speak() 메소드 선언");
    }
}

public class Review {
    public static void main(String[] args) {
        Person p = new Person();
        p = new Student();
        p.speak();
        p = new GraduateStudent();
        p.speak();
    }
}
