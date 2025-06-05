package util.model;

public class Member {
    // 사용할 멤버 변수,
    // 이름, 패스워드, 이메일, 등록일, 모두 문자열 형태
    // 생성자는 매개변수 4개 구성하기,
    // 각각의 정보를 호출하는 인스턴스 메서드를 생성.
    // 주의사항)현재, 접근 지정자, 상속, 객체 지향 기법을 모두 배운게 아니라
    // 현재 캡슐화 등 안하고, 일단 public 하는점 이해
    String name;
    String password;
    String email;
    String regDate;

    public Member(String name, String password, String email, String regDate) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.regDate = regDate;
    }

    public void showInfo() {
        System.out.println("회원 이름 : " + this.name);
        System.out.println("회원 이메일 : " + this.email);
        System.out.println("회원 패스워드 : " + this.password);
        System.out.println("회원 등록일 : " + this.regDate);
    }

    // 이름 조회 기능
    public String getName() {
        return name;
    }
    // 이메일 조회 기능
    public String getEmail() {
        return email;
    }







}
