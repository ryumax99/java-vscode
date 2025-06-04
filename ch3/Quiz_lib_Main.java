package ch3;

import java.util.Scanner;

public class Quiz_lib_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("도서 관리 프로그램");
            System.out.println("=================================================================");
            System.out.println("1. 도서 추가 , 2. 도서 조회, 3. 도서 수정, 4. 도서 삭제, 5. 더미 도서 생성,  6. 도서검색,  0. 종료");
            System.out.println("=================================================================");
            System.out.print("메뉴를 선택하세요(0 ~ 6): ");
            menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1:
                    Quiz_lib.addbook(scanner);
                    break;
                case 2:
                    Quiz_lib.viewBooks();
                    break;
                case 3:
                    Quiz_lib.updateBook(scanner);
                    break;
                case 4:
                    Quiz_lib.deleteBook(scanner);
                    break;
                case 5:
                    Quiz_lib.addDummyBooks();
                    break;    
                case 6:
                    Quiz_lib.searchBook(scanner);
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
