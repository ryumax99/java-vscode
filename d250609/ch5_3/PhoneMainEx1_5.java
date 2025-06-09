package d250609.ch5_3;

public class PhoneMainEx1_5 {
    public static void main(String[] args) {
        // 기본 인스턴스 2개 생성 후, 정보 확인.
        IphoneEx1_4 iphoneEx1_4 = new IphoneEx1_4("애플", "아이폰 16 ", "약 200만원", "서면롯데백화점");
        iphoneEx1_4.showInfo();

        GalaxyEx1_3 galaxyEx1_3 = new GalaxyEx1_3("삼성", "갤럭시25", "약 200만원", "samsung");
        galaxyEx1_3.showInfo();

        PhoneEx1_2 phoneIphone = new IphoneEx1_4("애플", "아이폰16", "약 200만원", "서면롯데백화점");
        // 형확인하는 연산자 이용 -> 원래의 타입을 확인하는 절차.
        if (phoneIphone instanceof IphoneEx1_4) {
            // 다운 캐스팅 : 위-> 아래 부모 클래스에서 -> 자식 클래스 타입으로 변환.
            IphoneEx1_4 iphoneEx1_42 = (IphoneEx1_4) phoneIphone;
            System.out.println("형이 아이폰 클래스가 맞다면 여기에만 있는 기능");
            iphoneEx1_4.sellInfo();
        } else if (phoneIphone instanceof GalaxyEx1_3) {
            GalaxyEx1_3 galaxyEx1_32 = (GalaxyEx1_3) phoneIphone;
            System.out.println("형이 갤럭시 클래스가 맞다면 여기에만 있는 기능");
            galaxyEx1_3.logoInfo();
        }

        PhoneEx1_2 samsungPhone = new GalaxyEx1_3("삼성", "갤럭시24", "약 200만원", "삼성로고");
        samsungPhone.showInfo();
        // samsungPhone.logoInfo(); //현재 타입은 부모타입이라 자식타입의 매서드를 못 봄.
        if (samsungPhone instanceof IphoneEx1_4) {
            // 다운 캐스팅 : 위-> 아래 부모 클래스에서 -> 자식 클래스 타입으로 변환.
            IphoneEx1_4 iphoneEx1_42 = (IphoneEx1_4) samsungPhone;
            System.out.println("형이 아이폰 클래스가 맞다면 여기에만 있는 기능");
            iphoneEx1_4.sellInfo();
        } else if (samsungPhone instanceof GalaxyEx1_3) {
            GalaxyEx1_3 galaxyEx1_32 = (GalaxyEx1_3) samsungPhone;
            System.out.println("형이 갤럭시 클래스가 맞다면 여기에만 있는 기능");
            galaxyEx1_3.logoInfo();
        }

    } 
}
