package ch2;

import util.user.UserService;

// public : 접근지정자, 파란색으로 표기 되는 부분은 예약어
// 변수명으로 따로 사용안됨.
// 파일명.java -> 파일명 = 클래스명 주의 사항) 클래스명 시작은 대문자
// 특수문자는 _,$ 와 이용가능,
// 패키지명, 변수명, 함수명(메소드), 소문자로 시작하고
public class Hello {
    // 정적인 메소드 하나 생성.
    // static : 정적 자원, 공유 자원, 나중에 인스턴스 개념과 구분해서 따로 설명.
    // int : 기본형 타입, 현재는 함수의 반환 타입,
    // sum : 함수의 이름
    // (int n, int m) : 매개변수, 받는 변수
    // return : 함수를 실행 후 , 반환하는 값,
    // 결론, 정수로 , n, m 값이 들어오면, 2개의 값을 더 해서 변환한다.
    // public static [반환값의 타입], [함수의 이름],([매개변수1],[매개변수2])
    // return 반환 하는 값;
    // 함수의 정의 
    public static int sum (int n, int m){
        return n + m ;
    }

    // public : 접근 지정자, 누구나 다 접근이 된다(모두 볼수 있다)
    // static : 공유 자원의 의미,
    // void : 반환값이 없다는 의미.
    // main : 함수 이름 , 메인 함수에서 실행해서, 메인으로 종료함.
    // String[] args : String : 문자열 타입 ,
    // [] : 배열을 의미
    // args , 배열의 이름 (변경 가능)
    public static void main(String[] args) {
        // sum(100, 200) : 함수 이용,
        // 사용법 : [받을 변수 타입] [받는 변수명] = 함수이름(인자값1, 인자값2)
        // 함수를 사용하면 -> 함수가 정의가 된곳으로 이동함.
        int result = sum(100, 200); 
        // 자바, 문자열은 무조건 ("") 큰 따옴표 사이에 작성.
        // 문자열 + 숫자 = 문자열 (타입)
        System.out.println("sum이라는 함수 이용해서 결과출력 : "+ result);
        // 퀴즈1 ,
        // 정적 메소드 하나 만들어서, 곱하기 기능이고,
        // result2 에 담아서, 출력해보기
        int result2 = s(10, 20);
        System.out.println("퀴즈 문제 : " + result2);
        int result3 = min(100, 97);
        System.out.println("퀴즈2 문제 답 : " + result3 );
        int result4 = div(99, 9);
        System.out.println("퀴즈3 문제 답 : " + result4 );
        float result5 = div_float(3, 2);
        System.out.println("div_float 문제 답 : " + result5 );
        int s;
        char a;
        s = 100;
        a = 'd';
        System.out.println("정수 표현 : " + s);
        System.out.println("문자 표현 : " + a);
        // UserService.registerUser();
    }
    public static int  min(int n, int m){
        return n - m ;
    }
    public static int  s(int n, int m){
        return n * m ;
    }
    public static int  div(int n, int m){
        return n / m ;
    }
    public static float  div_float(int n, int m){
        return (float) n / m ;
    }
       
}
    
 // 퀴즈 풀는 도중에, 정수로만 데이터 타입을 처리하고 있는데,
        // 소수로 -> 실수로 표현은 어떻게 할까?/
        // 데이터 타입에 대해서
        // 기본형,
        // byte, int, short ,float , long, double, char, boolean
        // 참조형 : 기본형을 제외한 나머지 모두를 가리킨다.
        // 객체(Object), 배열(Array), 문자열(String ) 등

        // 결론,
        /*
         * 1) 클래스 영역과, 메인 함수 영역 구분
         * 2) 메인 함수로 시작 , 끝으로 한다.
         * 3) 메인 함수도 알고 보니, 정적인 함수(메소드)
         * 4) 클래스명, 파일명(.java ) 동일해야한다.
         * 5) 변수에서 , 기본형, 참조형이 있는데, 현재는 2개, int , String 타입 이야기 했고,
         * 6) 문자열을 표기시에 , 큰 따옴표로 표기해서 사용한다.
         * 7) 정적 메소드(함수)를 정의하고,
         * 8) 정적 메소드를 사용(호출), 사용시, 정의한 메소드로 가서, 액션을 하고 돌아와서 재사용.
         * 9) 클래스 명, 대문자로 시작하고, 패키지 명과, 메소드(함수)명 은 소문자로 시작하고
         * 10) 이름 작성시, 사용 가능한 특수 문자는 $, _ , 달러기호와 언더바만 사용 가능.
         * 
         */   