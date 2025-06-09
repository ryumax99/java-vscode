package d250609.ch5_3;

public class IphoneEx1_4 extends PhoneEx1_2 {
    // 자식 클래스
    private String sellPlace;

    public void sellInfo() {
        System.out.println("판매처 : " + sellPlace);
    }

    // 생성자 만들기.
    public IphoneEx1_4(String sellPlace) {
        // super(); 생략됨
        this.sellPlace = sellPlace;
    }

    public IphoneEx1_4(String company, String name, String price, String sellPlace) {
        super(company, name, price); // 명시적 표기
        this.sellPlace = sellPlace;
    }

    
    
}
