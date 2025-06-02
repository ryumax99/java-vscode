package ch2;

import java.util.Scanner;

import util.UserService;
import util.UserService_doc;

// 퀴즈2
        // 새로운 ScannerTest2 클래스 만들기.
        // 회원 가입 해보기.
        // 콘솔에 출력되는 내용
        // 이상용 홈피 회원가입

        // 힌트는 모두 문자열 해도 좋습니다.
        // 이름 입력해주세요 >
        // 이메일 입력해주세요 >
        // 패스워드 입력해주세요 >

        // 출력 결과는
        // 이름 : {이름}
        // 이메일 : {이메일}
        // 패스워드 : {패스워드}
        // 회원 가입 완료되었습니다.

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // UserService_doc.registerUser(scanner);
        UserService_doc.loginUser(scanner);
        scanner.close();
    }
    
}
