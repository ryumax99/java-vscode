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
        int[][] array = new int[3][3];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
            array[i][j] = value++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // 행 끝나면 줄바꿈
        }            
    }
    public static String quiz1_3(String[] strings) {
        // 기본 유효성 체크
        if (strings == null || strings.length == 0) {
            return null; // 빈 배열 처리
        }
        // 상태 변수, 가장 긴 문자열을 임시로 저장.
        // 초기값이 예시 : "apple"
        String longest = strings[0]; // 첫 번째 문자열로 초기화

        // strings 문자열을 요소로 가지는 배열을 반복하면서, 하나씩 꺼내서 비교
        for (String str : strings) {
            // longest : 예시 , "apple", length() : 5
            // str : 예시 , "banana" , length() : 6
            if (str.length() > longest.length()) {
                longest = str; // 더 긴 문자열 발견 시 업데이트
            }
        }

        return longest; // 가장 긴 문자열 반환
    }

    // 임의로, 크기가 5개인, 문자열의 길이는 10개이하인, 랜덤한 문자열을 생성하는 메서드
    // 반환 타입 : 문자열 배열 ,
    public static String[] generateRandomStrings(int size) {
        String[] randomStrings = new String[size];
        String characters = "abcdefghijklmnopqrstuvwxyz"; // 소문자 알파벳

        for (int i = 0; i < size; i++) {
            int length = (int) (Math.random() * 10) + 1; // 1~10 사이의 길이
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < length; j++) {
                int index = (int) (Math.random() * characters.length());
                sb.append(characters.charAt(index)); // 랜덤 문자 추가
            }

            randomStrings[i] = sb.toString(); // 문자열로 변환하여 배열에 저장
        }

        return randomStrings; // 생성된 문자열 배열 반환
    }
}

