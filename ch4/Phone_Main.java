package ch4;

public class Phone_Main {
    public static void main(String[] args) {

        // 퀴즈
        // 본인 만들 Phone 클래스를 , 담을 배열을 만들어서,
        // 1) 담기 2) 출력하기. 3) 각 멤버의 주소값 확인 해보기.



        Phone phone1 = new Phone();
        phone1.model = "s24";
        phone1.price = "120만원";
        phone1.company = "삼성";
        // phone1.showInfo();
        
        Phone phone2 = new Phone();
        phone2.model = "s25";
        phone2.price = "150만원";
        phone2.company = "삼성";
        // phone2.showInfo();
        
        Phone phone3 = new Phone();
        phone3.model = "Iphone 16";
        phone3.price = "130만원";
        phone3.company = "애플";
        // phone3.showInfo();

        Phone phone4 = new Phone("s25+");
        // phone4.showInfo();
        
        Phone phone5 = new Phone("S25 Ultra", "180만원");
        // phone5.showInfo(); 

        Phone phone6 = new Phone("Iphone 16 pro","170만원","애플");
        // phone6.showInfo();

        Phone[] phones = new Phone[6];

        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;
        phones[3] = phone4;
        phones[4] = phone5; 
        phones[5] = phone6;

        System.out.println("=== Phone 정보 출력 ===");
        for (Phone p : phones) {
            p.showInfo();
        }

        System.out.println("phone1 주소: " + System.identityHashCode(phone1));
        System.out.println("phone2 주소: " + System.identityHashCode(phone2));
        System.out.println("phone3 주소: " + System.identityHashCode(phone3));
        System.out.println("phone4 주소: " + System.identityHashCode(phone4));
        System.out.println("phone5 주소: " + System.identityHashCode(phone5));
        System.out.println("phone5 주소: " + System.identityHashCode(phone6));

    }
}
