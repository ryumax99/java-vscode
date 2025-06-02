package util;

import java.util.Scanner;

public class UserService {
    public static void registerUser(Scanner scanner){
        String currentTime = DateUtil.getCurrentDateTime();
        System.out.println("회원가입" + " 현재 시각 : " + currentTime );
        // Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 > ");
        String name = scanner.nextLine();
        System.out.println("이메일을 입력해주세요 > ");
        String email = scanner.nextLine();
        String password;
        while (true) {
            System.out.println("패스워드 입력해주세요 > ");
            password = scanner.nextLine();
            System.out.println("패스워드 확인 입력해주세요 > ");
            String password2 = scanner.nextLine(); 
            if (password.isEmpty()) {
                System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
            } else if (password.equals(password2)) { 
                System.out.println("패스워드가 일치합니다");
                break; 
            } else {
                System.out.println("패스워드가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
        System.out.println("입력한 이름 : " + name);
        System.out.println("입력한 이메일 : " + email);
        System.out.println("입력한 패스워드 : " + password);
        String currentTime2 = DateUtil.getCurrentDateTime();
        System.out.println("회원가입 시간 : " + currentTime2);
        System.out.println("회원가입 완료되었습니다.");

        // scanner.close();
    }
    public static void userLogin(Scanner scanner) { 
        System.out.println("류성원 홈피 로그인");

        String email = ""; 
        String password = ""; 
        while (true) {
            System.out.println("이메일 입력해주세요 > ");
            email = scanner.nextLine(); 
            if (email.isEmpty()) {
                System.out.println("이메일은 비워둘 수 없습니다. 다시 입력해주세요.");
                continue; 
            }            
            System.out.println("패스워드 입력해주세요 > ");
            password = scanner.nextLine(); 
            if (password.isEmpty()) {
                System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
                continue; 
            }
            if (email.equals("admin@naver.com") && password.equals("1234")) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패, 이메일 또는 패스워드를 확인해주세요.");
                continue; 
            }
            break;

        }

        System.out.println("로그인 이메일 정보 : " + email);
        System.out.println("로그인 패스워드 정보 : " + password);
        System.out.println("로그인 완료되었습니다. 현재 임시로 단순 출력용입니다.");

    }

}

