package ch2;

// 퀴즈 4 - 과제
        // 본인의 이름과, 전화번호, 이메일을 입력 받는 매개변수가 3개이고,
        // 출력값은 문자열 타입인데 : 결과는
        // 저는 {이름} 입니다.
        // 제 전화번호 : {전화번호}이고,
        // 이메일: {이메일} 입니다.
        // 출력 하는 예제 해보기.
public class Quiz4 {
    public static void main(String[] args) {
        String name = "류성원";
        String phone = "010-1234-5678";
        String email = "aaa@aaa.com";

        System.out.println("저는 " + name + " 입니다.");
        System.out.println("제 전화번호 : " + phone + "이고,");
        System.out.println("이메일: " + email + " 입니다.");
            
    }
}