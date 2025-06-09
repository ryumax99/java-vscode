package d250609.ch4;

public class GetterSetterEXMain {
    public static void main(String[] args) {
        GetterSetterEX getterSetterEX = 
        new GetterSetterEX("류성원", "aaa", "1234");
        // getterSetterEX.name = "직접 접근해서 이름 수정";
        // getterSetterEX.email = "aaa";
        // getterSetterEX.password = 1234;
        getterSetterEX.showInfo();
        System.out.println("Getter 라는 메서드를 이용해서, 각 멤버 변수 하나 조회 확인");
        System.out.println("이름 조회 : " + getterSetterEX.getName());
        System.out.println("이메일 조회 : " + getterSetterEX.getEmail());
        System.out.println("패스워드 조회 : " + getterSetterEX.getPassword());
        System.out.println("Setter 라는 메서드를 이용해서, 각 멤버 변수 값 설정 확인");
        getterSetterEX.setName("이상용 setter로 수정");
        getterSetterEX.setEmail("lsy@naver.com  setter로 수정");
        getterSetterEX.setPassword("123456  setter로 수정");
        System.out.println("Setter 를 이용해서, 데이터 변경하고, 값 확인. ");
        getterSetterEX.showInfo();
    }
}
