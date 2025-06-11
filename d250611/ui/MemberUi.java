package d250611.ui;

import java.util.Scanner;

import ch3.Exs_ch3_2_user_array_doc;

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
                    Exs_ch3_2_user_array_doc.addUser(scanner); 
                    break;
                case 2:
                    Exs_ch3_2_user_array_doc.viewUsers(); 
                    break;
                case 3:
                    Exs_ch3_2_user_array_doc.updateUser(scanner); 
                    break;
                case 4:
                    Exs_ch3_2_user_array_doc.deleteUser(scanner); 
                    break;
                case 5:
                    Exs_ch3_2_user_array_doc.addDummyUsers(); 
                    System.out.println("더미 데이터 5개가 추가되었습니다.");
                    break;
                case 6:
                    Exs_ch3_2_user_array_doc.searchUser(scanner); 
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
