package d250611.ui;

import java.util.Scanner;


import d250611.service.UserService_ArrayList_version;
import d250611.service.UserService_HashMap_version;

public class MemberUi {
    public static void drawUI(Scanner scanner) {
        int menu;
        do {
            System.out.println("회원 관리 프로그램 예시");
            System.out.println("=================================================================");
            System.out.println("1. 회원 추가 , 2. 회원 조회, 3. 회원 수정, 4. 회원 삭제, 5.더미 데이터 추가 5개, 6. 검색기능,  0. 종료");
            System.out.println("=================================================================");
            System.out.print("메뉴를 선택하세요(0 ~ 6): ");
            menu = scanner.nextInt();
            scanner.nextLine(); 
            switch (menu) {
                case 1:
                    // UserService_ArrayList_version.addUser(scanner); 
                    UserService_HashMap_version.addUser(scanner);
                    break;
                case 2:
                    // UserService_ArrayList_version.viewUsers();
                    UserService_HashMap_version.viewUsers();
                    break;
                case 3:
                    // UserService_ArrayList_version.updateUser(scanner);
                    UserService_HashMap_version.updateUser(scanner); 
                    break;
                case 4:
                    // UserService_ArrayList_version.deleteUser(scanner);
                    UserService_HashMap_version.deleteUser(scanner); 
                    break;
                case 5:
                    // UserService_ArrayList_version.addDummyUsers(); 
                    UserService_HashMap_version.addDummyUsers();
                    System.out.println("더미 데이터 5개가 추가되었습니다.");
                    break;
                case 6:
                    // UserService_ArrayList_version.searchUser(scanner); 
                    UserService_HashMap_version.searchUser(scanner); 
                    System.out.println("회원 검색 기능이 실행되었습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }

        } while (menu != 0);
    }
}
