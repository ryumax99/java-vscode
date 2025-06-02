package ch2;

public class Exs_Main {
    public static void main(String[] args) {
        System.out.println("파이널 상수 이용한, 원면적 구하기 예제");
        // 반지름 5.0인 원의 면적 구하기
        String result = Exs.getCircleArea(5.0);
        System.out.println(result);
        Exs.getTypeExam();
        String result1 = Exs.getTernaryExam(75);
        System.out.println("EX2-9, 삼항 연산자 예시: " + result1);
        System.out.println("----------------------------");
    }
}
