package d250609.ch5;

public class Inheritance_Ex1 {
    // 상속, 기본 문법
    // public class 자식클래스명 extends 부모 클래스명 {}
    // 부모 클래스 : Animal 자식클래스 : Dog
    public static void main(String[] args) {
        Dog_Ex1 dog_Ex1 = new Dog_Ex1();
        dog_Ex1.speak();
        System.out.println("====================================");
        Dog_Ex1 dog_Ex12 = new Dog_Ex1("비글멍멍이", "영국");
        dog_Ex12.showInfo();
    }
}