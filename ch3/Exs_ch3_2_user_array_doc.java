package ch3;


import java.util.Scanner;
import util.model.Member;
import util.date.*;

public class Exs_ch3_2_user_array_doc {

    

    static final int MAX_USERS = 100; // 최대 회원 수
    
    // static String[] names = new String[MAX_USERS];
    // static String[] emails = new String[MAX_USERS];
    // static String[] passwords = new String[MAX_USERS];
    // static String[] registrationDates = new String[MAX_USERS];
    // 상태 변수,

    static Member[] members = new Member[MAX_USERS];

    static int userCount = 0; // 현재 등록된 회원 수

    
    // 추가작업-1 개요
    // 추가작업-클래스 타입으로 데이터를 모아놓고,
    // 배열에 폰 클래스 타입으로 담는 작업
    // 0)콘솔에서 입력 받은 정보들을 클래스에 담기
    // 1)회원정보를 담아둘 클래스를 정의, Member 클래스 만들기
    // 1-2) 맴버 : 이름, 이메일, 패스워드, 등록일, 기능 : 각 정보를
    // 2)회원 클래스를 담아둘 배열을 생성하기.


    // 회원 추가 메서드
    public static void addUser(Scanner scanner) {
        if (userCount < MAX_USERS) { // 기본 유효성 체크
            System.out.println("이름을 입력하세요: ");
            String name = scanner.nextLine();


            System.out.println("이메일을 입력하세요: ");
            String email = scanner.nextLine();


            System.out.println("패스워드를 입력하세요: ");
            String password = scanner.nextLine();


            // 현재 날짜와 시간 저장
            String registrationDate = DateUtil.getCurrentDateTime();

            // 사용자들로 부터 입력 받은 정보를, 모델 클래스의 인스턴스 생성하는데 사용
            Member member = new Member(name, password, email, registrationDate);
                
            
            members[userCount] = member;

            // 회원 수 증가
            userCount++;
            System.out.println("회원이 추가되었습니다: " + name + ", " + email + ", " + registrationDate);
        } else {
            System.out.println("회원 수가 최대치를 초과했습니다.");
        }
    } // 회원 추가 메서드

    // 회원 조회 메서드
    public static void viewUsers() {
        if (userCount == 0) {
            System.out.println("등록된 회원이 없습니다.");
            return; // 등록된 회원이 없을 때, 조회 기능 종료, 메서드(함수)를 나가기
        }
        System.out.println("등록된 회원 목록:");
        for (int i = 0; i < userCount; i++) {
            // System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + names[i] + ", " + emails[i] + ", "
            //         + registrationDates[i] );
            members[i].showInfo();
        }
    } // 회원 조회 메서드

    // 회원 수정 메서드
    // 회원 전체 목록에서, 해당 회원의 인덱스를 번호를 이용해서, 회원 정보를 수정해보기.
    public static void updateUser(Scanner scanner) {
        System.out.println("수정할 회원의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt(); // 수정할 회원의 인덱스 입력
        scanner.nextLine(); // 개행 문자 제거
        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 회원의 이름을 입력하세요: ");
        String name = scanner.nextLine();
        // names[index] = name; // 이름 수정

        System.out.println("수정할 회원의 이메일을 입력하세요: ");
        String email = scanner.nextLine();
        // emails[index] = email; // 이메일 수정

        System.out.println("수정할 회원의 패스워드를 입력하세요: ");
        String password = scanner.nextLine();
        // passwords[index] = password; // 패스워드 수정

        // 현재 날짜와 시간 저장
        String registrationDate = DateUtil.getCurrentDateTime();
        // registrationDates[index] = registrationDate; // 등록일 수정

        // 변경할 정보를 담을 Member 객체 생성
        Member member = new Member(name, password, email, registrationDate);
        members[index] = member;

        System.out.println("회원 정보가 수정되었습니다: " + name + ", " + email);
    } // 회원 수정 메서드

    // 회원 삭제 메서드
    // 수정 처럼, 회원의 인덱스 번호를 입력시, 삭제하는 로직.
    public static void deleteUser(Scanner scanner) {
        System.out.println("삭제할 회원의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt(); // 삭제할 회원의 인덱스 입력
        scanner.nextLine(); // 개행 문자 제거

        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return; // 잘못된 인덱스를 입력시, 삭제 기능을 종료 한다는 의미.
        }
        // 삭제할 회원 정보 출력
        Member member = members[index];
        System.out.println("삭제할 회원 정보: ");
        member.showInfo();

        members[index] = null;

        // 해당 인덱스의 회원 정보를 삭제하고, 뒤에 있는 회원 정보를 앞으로 이동
        for (int i = index; i < userCount - 1; i++) {
            // names[i] = names[i + 1];
            // emails[i] = emails[i + 1];
            // passwords[i] = passwords[i + 1];
            // registrationDates[i] = registrationDates[i + 1];
            members[i] = members [i + 1];
        }
        // 마지막 회원 정보는 null로 설정
        // names[userCount - 1] = null;
        // emails[userCount - 1] = null;
        // passwords[userCount - 1] = null;
        // registrationDates[userCount - 1] = null;
            members[userCount - 1] = null;
        // 회원 수 감소
        userCount--;
        System.out.println("회원이 삭제되었습니다.");
    }
    // 회원 삭제 메서드

    // 회원 더미 데이터 5개 추가하는 메서드
    public static void addDummyUsers() {
        for (int i = 0; i < 5; i++) {
            if (userCount < MAX_USERS) {
                // names[userCount] = "더미회원" + (i + 1);
                // emails[userCount] = "dummy" + (i + 1) + "@example.com";
                // passwords[userCount] = "password" + (i + 1);
                // registrationDates[userCount] = DateUtil.getCurrentDateTime();
                Member dummyMember = new Member(
                        "더미회원" + (i + 1),
                        "password" + (i + 1),
                        "dummy" + (i + 1) + "@example.com",
                        DateUtil.getCurrentDateTime());
                members[userCount] = dummyMember;
                userCount++;
            } else {
                System.out.println("더미 회원 추가 실패: 최대 회원 수 초과");
                break;
            }
        }
        System.out.println("더미 회원 5명이 추가되었습니다.");
    }
    // 회원 더미 데이터 5개 추가하는 메서드

    // 검색 기능
    // 회원 목록에서 이름 또는 이메일로 검색하는 기능을 추가할 수 있습니다.
    public static void searchUser(Scanner scanner) {
        System.out.println("검색할 회원의 이름 또는 이메일을 입력하세요: ");
        String searchQuery = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < userCount; i++) {
            // 배열.contins() 메서드를 사용하여 검색어가 이름 또는 이메일에 포함되어 있는지 확인
            // contains() 메서드는 문자열에 특정 문자열이 포함되어 있는지 확인하는 메서드입니다.
            // 예시) names[i].contains(searchQuery) -> names[0] = "이상용" , searchQuery = "이상용"
            // if (names[i].contains(searchQuery) || emails[i].contains(searchQuery)) {
            //     System.out.println("검색 결과: " + (i + 1) + ". " + names[i] + ", " + emails[i] + ", "
            //             + registrationDates[i]);
            //     found = true;
            // }
            if (members[i].getName().contains(searchQuery) || members[i].getEmail().contains(searchQuery)) {
                // System.out.println("검색 결과: " + (i + 1) + ". " + names[i] + ", " + emails[i] +
                // ", "
                // + registrationDates[i]);
                members[i].showInfo(); // 회원 정보 출력
                found = true;
            }
        }

        if (!found) { // 검색 결과가 있을 경우, 실행이 안됨, found = true; -> false;
            System.out.println("검색 결과가 없습니다.");
        }
    }
    // 검색 기능

}
