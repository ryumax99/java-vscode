package ch4;

public class Phone {
    // 퀴즈1
    // 설계 클래스, Phone ,
    // 멤버 변수 : model, price, company
    // 메서드 : showInfo(), 해당 정보 출력하는 메서드 만들기.
    // 객체 3개 이상 생성후, 정보 출력하는 메소드 사용해보기
    String model;
    String price;
    String company;

    public void showInfo() {
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
    }
}
