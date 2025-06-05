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
        // 메모리 위치 주소값이 다르다
        Phone[] phones = new Phone[5];

        Phone phone1 = new Phone("Galaxy S23", "100만원", "삼성전자");
        Phone phone2 = new Phone("iPhone 14", "120만원", "Apple");
        Phone phone3 = new Phone("Pixel 7", "90만원", "Google");
        Phone phone4 = new Phone("OnePlus 11", "80만원", "OnePlus");
        Phone phone5 = new Phone("Xiaomi 13", "70만원", "Xiaomi");

        phones[0] = phone1; // 0번째 요소에 phone1 객체 할당
        phones[1] = phone2; // 1번째 요소에 phone2 객체 할당
        phones[2] = phone3; // 2번째 요소에 phone3 객체 할당
        phones[3] = phone4; // 3번째 요소에 phone4 객체 할당
        phones[4] = phone5; // 4번째 요소에 phone5 객체 할당

        Phone[] phones2 = {
                phone1,
                phone2,
                phone3,
                phone4,
                phone5
        };

        System.out.println("phone1 주소: " + System.identityHashCode(phone1));
        System.out.println("phone2 주소: " + System.identityHashCode(phone2));

        String[] carModels = { "suv", "k5세단", "아반떼", "소나타", "그랜저" };
        int[] carPrices = { 4000, 3000, 2500, 3500, 5000 };

    }
}
