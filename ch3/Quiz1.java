package ch3;

import java.util.Scanner;

        // -- 퀴즈1,
        // -- 사용자로부터 정수 5개를 입력받아 배열에 저장하고 역순 출력

        // -- 퀴즈2,
        // -- 3x3 배열을 만들어 모든 요소에 1~9 채우고 출력

        // -- 퀴즈3,
        // -- 문자열 배열을 메서드로 받아 가장 긴 문자열을 반환

public class Quiz1 {
    public static void quiz1_1(Scanner scanner) {
        int intArray[] = new int[5];
        System.out.println("숫자 5개를 띄어쓰기로 구분해서 입력하세요 (예: 1 2 3 4 5):");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("입력한 숫자의 역순 출력:");
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
    public static void quiz1_2() {
        
    }
}
