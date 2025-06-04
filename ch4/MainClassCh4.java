package ch4;

public class MainClassCh4 {
    // 실행하는 클래스
    public static void main(String[] args) {
        // 설계한 클래스를 이용해서 객체 생성
        // [클래스명] 객체명(인스턴스 변수명) = new [클래스명]();
        Car car1 = new Car();
        car1.model = "suv";
        car1.price = "4000만원";
        car1.company = "기아자동차";
        // 기능 확인. 객체명.메서드명();
        car1.showInfo();

        // 마치 공장에서 자동차를 찍어 내듯이, 또 다른 인스턴스를 생성
        Car car2 = new Car();
        car2.model = "k5세단";
        car2.price = "3000만원";
        car2.company = "기아자동차";
        car2.showInfo();
    }
}
