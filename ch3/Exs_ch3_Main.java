package ch3;

import java.util.Scanner;

public class Exs_ch3_Main {
    public static void main(String[] args) {
        // 공용으로 사용할 스캐너
        Scanner scanner = new Scanner(System.in);

        // int[] returnArray = Exs_ch3.ex3_8_return();
        // System.out.println("ex3-8-2, 리턴된 배열의 값:");
        // for (int number : returnArray) {
        //     System.out.print(number + " "); // 1 2 3 4 5 출력
        // }

        // Exs_ch3.ex3_8();
        System.out.println("============================");
        // ex3_7 , 확인 하는 예시 메소드
        // Exs_ch3.ex3_7(scanner);
        System.out.println("============================");

        // 회원 관리 프로그램 예시, ui 그리기,
        // Exs_ch3.ex_user_ui(scanner);
        System.out.println("============================");
        
        // Ex3-6-4, 배열을 이용한 회원 관리 프로그램 예시
        // int menu;
        // do {
        //     System.out.println("회원 관리 프로그램 예시");
        //     System.out.println("=================================================================");
        //     System.out.println("1. 회원 추가 , 2. 회원 조회, 3. 회원 수정, 4. 회원 삭제, 5.더미 데이터 추가 5개, 6. 검색기능,  0. 종료");
        //     System.out.println("=================================================================");
        //     System.out.print("메뉴를 선택하세요(0 ~ 6): ");
        //     menu = scanner.nextInt();
        //     scanner.nextLine(); // 개행 문자 제거
        //     switch (menu) {
        //         case 1:
        //             Exs_ch3_2_user_array_doc.addUser(scanner); // 회원 추가
        //             break;
        //         case 2:
        //             Exs_ch3_2_user_array_doc.viewUsers(); // 회원 조회
        //             break;
        //         case 3:
        //             Exs_ch3_2_user_array_doc.updateUser(scanner); // 회원 수정
        //             break;
        //         case 4:
        //             Exs_ch3_2_user_array_doc.deleteUser(scanner); // 회원 삭제
        //             break;
        //         case 5:
        //             Exs_ch3_2_user_array_doc.addDummyUsers(); // 더미 데이터 추가
        //             System.out.println("더미 데이터 5개가 추가되었습니다.");
        //             break;
        //         case 6:
        //             Exs_ch3_2_user_array_doc.searchUser(scanner); // 회원 검색
        //             System.out.println("회원 검색 기능이 실행되었습니다.");
        //             break;
        //         case 0:
        //             System.out.println("프로그램을 종료합니다.");
        //             break;
        //         default:
        //             System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
        //     }

        // } while (menu != 0); // 메뉴가 0이 아닐 때까지 반복
        // System.out.println("============================");

        // Ex3-6-3, 이중 배열 예시
        // Exs_ch3.ex3_6_3();
        System.out.println("============================");

        // Ex3-6-2, 배열 직접 생성과 값 할당 예시
        // Exs_ch3.ex3_6_2();

        // Ex3-6, 배열1, 기본 생성과, 값 할당, 반복문 활용한 출력 예시
        // Exs_ch3.ex3_6();
        System.out.println("============================");

        // Ex3-5, continue 확인 , 다음 반복으로 넘어가는 예시,
        // Exs_ch3.ex3_5(scanner);
        System.out.println("============================");

        // Ex3-4 , 중첩 반복문 이용해서 구구단 출력해보기
        // Exs_ch3.ex3_4();

        // Ex3-3 퀴즈 ,do while 문 예시 확인.
        // Exs_ch3.ex3_3();
        System.out.println("\n============================");

        // Ex3-2 퀴즈 , 예시 확인.
        // int count = Exs_ch3.ex3_2_quiz(scanner);
        // System.out.println("입력한 문자 개수: " + count);
        System.out.println("============================");

        // Ex3-2 , 예시 확인.
        // Exs_ch3.ex3_2(scanner);
        System.out.println("============================");

        // Ex3-1 , 예시 확인.
        // int result_ex3_1 = Exs_ch3.getSum(10); // 55
        // System.out.println("Ex3-1: 1~10까지의 합 = " + result_ex3_1);

        scanner.close(); // 스캐너 자원 반납
    }
}
