package ch2;

import java.util.Scanner;

public class OperConditionTestMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("연산자 확인 및 조건문 테스트 시작");
        // 순서2,
        // 만든 메서드, 확인 1
        OperConditionTest.oper1(); // 산술 연산자 테스트
        System.out.println("2번 연산자 테스트");
        OperConditionTest.oper2();
        System.out.println("2로 나누고 싶은 숫자 입력");
        OperConditionTest.oper3(scanner);
        OperConditionTest.conditionExample();
    }
    
        
    
}
