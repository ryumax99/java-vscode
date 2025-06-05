package homework.rsw0605.ch4;

import java.util.Scanner;

public class Main {
    // 퀴즈
    // 폴더 만들기 -homework
    // homework 폴더 안에,-> 0605 폴더 ->
    // ch4 폴더 -> 기능 클래스 만들기, 실행 클래스 만들기, 모델 클래스 만들기.
    // 자동차 관리 프로그램 만들기,
    // 자동차 정보 1) 자동차명, 2) 제조사, 3) 연식, 4) 등록일로 구성,
    // 메서드 : showInfo() 메서드 만들기,
    // 자동차 정보 CRUD , 추가, 조회, 수정, 삭제 기능 , 검색, 더미데이터 추가 구현.
    // 최대한 강사 코드 재사용해서 복습하기.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Func.car_main(scanner);
        scanner.close();
    }
}
