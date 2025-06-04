package ch3;

import java.util.Scanner;

import util.date.DateUtil;

public class Quiz_lib {
    // 퀴즈,
    // 아래 코드를 이용해서,
    // 도서 관리 프로그램을 만들기,
    // + @ : 검색 기능 넣기
    // 도서 정보 1) 도서명, 2) 저자, 3) 출판사, 4) 등록일로 구성,
    // 도서 정보 CRUD , 추가, 조회, 수정, 삭제 기능, 검색까지 구현.
    // 검사 확인시, 기능 구현 다 보여주고, 각 메서드 기능에 대해서 질문 할 예정.

    static final int MAX_BOOK = 100;
    static String[] bnames = new String[MAX_BOOK];
    static String[] writers = new String[MAX_BOOK];
    static String[] publishers = new String[MAX_BOOK];
    static String[] regdates = new String[MAX_BOOK];
    static int bookCount = 0;

    public static void addbook(Scanner scanner){
        if (bookCount < MAX_BOOK) {
            System.out.println("도서명을 입력하세요 : ");
            String names = scanner.nextLine();
            bnames[bookCount] = names;

            System.out.println("저자를 입력하세요 : ");
            String writer = scanner.nextLine();
            writers[bookCount] = writer;

            System.out.println("출판사를 입력하세요 : ");
            String publisher = scanner.nextLine();
            publishers[bookCount] = publisher;

            String regdate = DateUtil.getCurrentDateTime();
            regdates[bookCount] = regdate;

            bookCount++;
            System.out.println("도서명이 추가되었습니다: " + names + ", " + writer + ", "+ publisher + ", " + regdate);
        
        } else {
            System.out.println("도서량이 최대치를 초과했습니다.");
        }
    }
    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("등록된 도서명이 없습니다.");
            return; 
        }
        System.out.println("등록된 도서 목록:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + "도서명 : " + bnames[i] + ", " + "저자 : " + writers[i] + ", " + "출판사 : " + publishers[i] + ", "
                    + regdates[i]);
        }
    }
    public static void updateBook(Scanner scanner) {
        System.out.println("수정할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt(); 
        scanner.nextLine(); 
        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 도서명을 입력하세요: ");
        String names = scanner.nextLine();
        bnames[index] = names; 
        
        System.out.println("수정할 저자명을 입력하세요: ");
        String writer = scanner.nextLine();
        writers[index] = writer; 

        System.out.println("수정할 출판사를 입력하세요: ");
        String publisher = scanner.nextLine();
        publishers[index] = publisher; 

        
        String regdate = DateUtil.getCurrentDateTime();
        regdates[index] = regdate;
        
        System.out.println("도서의 정보가 수정되었습니다: " + bnames[index] + ", " + writers[index]);
    } 
    public static void deleteBook(Scanner scanner) {
        System.out.println("삭제할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt(); 
        scanner.nextLine(); 

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return; 
        }
        System.out.println("삭제할 도서 정보: " + bnames[index] + ", " + writers[index] + ", " + regdates[index]);

        for (int i = index; i < bookCount - 1; i++) {
            bnames[i] = bnames[i + 1];
            writers[i] = writers[i + 1];
            publishers[i] = publishers[i + 1];
            regdates[i] = regdates[i + 1];
        }

        bnames[bookCount - 1] = null;
        writers[bookCount - 1] = null;
        publishers[bookCount - 1] = null;
        regdates[bookCount - 1] = null;

        bookCount--;
        System.out.println("도서가 삭제되었습니다.");
    }
    public static void addDummyBooks() {
        for (int i = 0; i < 5; i++) {
            if (bookCount < MAX_BOOK) {
                bnames[bookCount] = "더미도서" + (i + 1);
                writers[bookCount] = " mr.더미 " + (i + 1) + " 저자";
                publishers[bookCount] = "더미 출판사" + (i + 1);
                regdates[bookCount] = DateUtil.getCurrentDateTime();
                bookCount++;
            } else {
                System.out.println("더미 도서 추가 실패: 최대 도서 수 초과");
                break;
            }
        }
        System.out.println("더미 도서 5개가 추가되었습니다.");
    }
    public static void searchBook(Scanner scanner) {
        System.out.println("검색할 도서의 이름 또는 저자를 입력하세요 : ");
        String searchQuery = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (bnames[i].contains(searchQuery) || writers[i].contains(searchQuery)) {
                System.out.println("검색 결과: " + (i + 1) + ". " + "도서명 : " + bnames[i] + ", " + "저자 : " + writers[i] + ", " + "출판사 : " + publishers[i] + ", "
                        + regdates[i]);
                found = true;
            }
        }

        if (!found) { 
            System.out.println("검색 결과가 없습니다.");
        }
    }




}



