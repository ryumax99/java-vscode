package ch2;

import java.util.Scanner;

public class Exs {

    // 퀴즈 ,
    // 정적 메서드 만들기.
    // 사용자 이름 입력 받고, 좋아하는 월을 입력 받고, 예시 메서드, exMini_quiz1("홍길동", 5);
    // 출력은 "홍길동님, 좋아하는 월은 5월입니다." 출력하기.
    // 좋아하는 월에 따른, 계절의 이름 출력, 봄(3~5), 여름(6~8), 가을(9~11), 겨울(12~2)
    // 1)switch 문 이용하거나, 2) if~ else if 문 이용해서 구현하기.
    public static void exMini_quiz1() {
        Scanner scanner = new Scanner(System.in);
        
    }

    public static String getTernaryExam(int score) {
        // score가 60 이상이면 "합격", 아니면 "불합격" 문자열 반환
        String result = (score >= 60) ? "합격" : "불합격";
        // if 문으로도 가능
        // if (score >= 60) {
        // result = "합격";
        // } else {
        // result = "불합격";
        // }
        return result;
    }
    //증감 연산자 예시, 복합 대입 연산자, a++, ++a 차이점
    public static void getIncDecExam() {
        int a = 10;
        int b = 20;
        System.out.println("a++ " + (a++));
        System.out.println("결과1 a: " + a);
        System.out.println("++a " + ++a);
        System.out.println("결과2 a" + a );
    }

    // 타입 변환
    public static String getTypeExam() {
        long num1 = 100L;
        long num2 = 100;
        byte num3 = 127;
        int num4 = 128;
        byte num5 = (byte)num4;
        System.out.println("num5: " + num5);
        return "곧 결과 변환 하거나 출력만 할 예정.";
    }

    // 정적인 메소드 이용
    // 확인 상항, 파이널, 상수 확인 및 원 면적 구하는 기능,
    // 반지름을 매개변수로 받고 , 원의 면적을 문자열 타입으로 반환하는 형태.
    public static String getCircleArea(double radius) {
        final double PI = 3.14159;
        if (radius < 0) {
            return "반지름은 음수가 될 수 없습니다.";
        }
        double area = PI * radius * radius;
        String result = String.format("반지름 %.2f의 원의 면적은 %.2f입니다.", radius, area);
        return result;
    }

}
