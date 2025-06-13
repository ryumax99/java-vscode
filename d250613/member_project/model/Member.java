package d250613.member_project.model;

public class Member {
    String name;
    String password;
    String email;
    String regDate;
//====================================================================================
        // 추가 사항, 회원의 정보 내용을 csv형식으로 문자열 한줄로 반환
    public String toCSV() {
        return name + "," + password + "," + email + "," + regDate;
    }
        // 한줄의 멤버의 정보를 Member 인스턴스를 생성하는 재료로 사용
    public static Member fromCSV(String csvLine) {
        String[] parts = csvLine.split(",",-1);
        if (parts.length != 4) {
            return null;
            
        }
        return new Member(parts[0], parts[2], parts[3], parts[4]);
    }

//====================================================================================

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
    // 나머지 멤버, 이름, 이메일, 패스워드, 등록일 각각의 세터/게터 모두 만들기.
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRegDate() {
        return regDate;
    }
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
    
}
