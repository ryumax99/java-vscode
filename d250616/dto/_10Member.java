package d250616.dto;

public class _10Member {
    // DTO : 데이터를 디비에 전달용으로 사용할 모델
    // 회원 관리 프로그램
    // 회원 추가, id, name, email, password, reg_date
    // 자바 -> 데이터 베이스,
    private int id;
    private String name;
    private String email;
    private String password;    
    private String reg_Date;
    // 기본 생성자
    public _10Member() {
    }

    // 1) 생성자 추가
    // 매개변수 생성자
    public _10Member(int id, String name, String email, String password, String reg_Date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.reg_Date = reg_Date;
    }

    // 2) 게터 세터 추가

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReg_Date() {
        return reg_Date;
    }

    public void setReg_Date(String reg_Date) {
        this.reg_Date = reg_Date;
    }


    // 3) 모델 클래스의 인스턴스를 출력시, 우리가 정의한 내용으로 출력, toString
    @Override
    public String toString() {
        return "_10Member [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", reg_Date="
                + reg_Date + "]";
    }

    

    

    
    
}
