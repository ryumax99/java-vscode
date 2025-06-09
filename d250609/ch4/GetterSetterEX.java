package d250609.ch4;

public class GetterSetterEX {
    public String name;
    private String email;
    private String password;

    public GetterSetterEX( String name,  String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("패스워드 : " + password);
    }

    public String getName() {
        return this.name; // 현재 인스턴스에 설정이 된 이름.
    }

    public String getEmail() {
        return this.email; // 현재 인스턴스에 설정이 된 이름.
    }

    public String getPassword() {
        return this.password; // 현재 인스턴스에 설정이 된 이름.
    }

    // 외부에서, 변경을 하는 경우, Setter 사용함.

    // 자동으로 코드를 생성해줌. 일단, 수동으로 확인.
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
