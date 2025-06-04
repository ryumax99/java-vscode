package ch4;

public class Car {
    // 설계하는 클래스
    // 객체 : 클래스로부터 만들어진 실체 (=인스턴스 )
    // 생성자 : 객체를 생성시 자동으로  호출되는 특별한 메소드
    // 1) 기본 생성자 2) 매개변수 생성자
    // 클래스의 구성품
    // 1) 멤버 변수
    // 2) 생성자
    // 3) 메소드

    //멤버 변수
    String model;
    String price;
    String company;

    // 생성자
    // 1) 기본 생성자
    // 2) 매개변수 생성자

    //메서드
    public void showInfo() {
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
    }
}
