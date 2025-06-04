package ch3;

import java.util.Scanner;

public class Quiz1_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz1.quiz1_1(scanner);
        scanner.close();
        // 퀴즈3, 문자열 배열을 메서드로 받아 가장 긴 문자열을 반환
        // 방법1
        String[] strings = { "apple", "banana", "cherry", "date" };
        String longestString = Quiz1.quiz1_3(strings);
        System.out.println("방법1, 가장 긴 문자열: " + longestString);
        // 방법2, strings, 랜덤하게 생성하는 메서드 이용해서,
        String[] randomStrings = Quiz1.generateRandomStrings(5);
        String longestRandomString = Quiz1.quiz1_3(randomStrings);
        System.out.println("방법2, 랜덤 문자열 중 가장 긴 문자열: " + longestRandomString);
    }
    
}
