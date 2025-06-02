package user_mini_project;

import java.util.Scanner;

import ch2.OperConditionTest;
import util.Random.RandomUtil;
import util.User.UserService;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("====================================================================================");
            System.out.println("회원 관리 시스템에 오신 것을 환영합니다.");
            System.out.println("1.회원가입 2.로그인 3.산술 연산자 테스트 호출 4.2로 나누기 계산 0.종료");
            System.out.println("5.로또 번호 만들기");
            System.out.println("====================================================================================");
            System.out.println("메뉴 번호를 선택해주세요 (0~5)");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                UserService.registerUser(scanner);
            } else if (choice.equals("2")) {
                UserService.userLogin(scanner);
            } else if (choice.equals("3")) {
                OperConditionTest.oper1();
            } else if (choice.equals("4")) {                
                OperConditionTest.oper3(scanner);
            } else if (choice.equals("5")) {                
                RandomUtil.generateLottoNumbers();
            } else if (choice.equals("0")) {
                System.out.println("프로그램을 종료합니다. 감사합니다!");
                scanner.close();
                return;
            } else {
                System.out.println("잘못된 입력입니다. 0, 1, 2, 3, 4, 5 중에서 선택해주세요.");
            }
        }
    }
}
