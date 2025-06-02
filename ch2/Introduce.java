package ch2;

public class Introduce {
    public static int sum (int n, int m){
        return n + m ;
    }
    public static int mul (int n, int m){
        return n * m ;
    }
    public static int  sub(int n, int m){
        return n - m ;
    }
    public static int  div(int n, int m){
        return n / m ;
    }
    public static float  div_float(int n, int m){
        return (float) n / m ;
    }
    public static String introduce(String name, String phone, String email) {
        String introduce_myself = "저는 " + name + " 입니다. 제 전화번호 : " + phone + " 이고,이메일: " + email + "입니다.";
        return introduce_myself;
    }
    public static String favorite(String food, String hobby, String game) {
        String info = "제가 좋아하는 음식은 : " + food + " 입니다."
                    + " 제 취미 : " + hobby + "이고,"
                    + " 좋아하는 게임: " + game + " 입니다.";
        return info;
    }
    public static void main(String[] args) {      
        int result = sum(100, 200);       
        System.out.println("sum이라는 함수 이용해서 결과출력 : "+ result);
        int result2 = mul(10, 20);
        System.out.println("mul이라는 함수 이용해서 결과출력 : "+ result2); 
        int result3 = sub(100, 97);
        System.out.println("퀴즈2 문제 답 : " + result3 );
        int result4 = div(99, 9);
        System.out.println("퀴즈3 문제 답 : " + result4 );
        float result5 = div_float(3, 2);
        System.out.println("div_float 문제 답 : " + result5 );
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
        int s;
        char a;
        s = 100;
        a = 'd';
        System.out.println();
        System.out.println("정수 표현 : " + s);
        System.out.println("문자 표현 : " + a);
        String introduce_info = introduce("류성원", "010-1234-5678", "aaa@aaa.com");
        System.out.println(introduce_info);
        // 퀴즈,
        // 내가 좋아하는 음식, 취미, 게임 등 알려주는 기능
        // 좋아하는 음식, 취미,게임 매개변수가 3개 정의
        // 출력
        //
        // 제가 좋아하는 음식은 : {음식이름} 입니다.
        // 제 취미 : {취미명}이고,
        // 좋아하는 게임: {게임명} 입니다.
        // 출력 하는 예제 해보기.
        String favorite_info = favorite("초밥", "유튜브시청", "롤");
        System.out.println(favorite_info);
    }
}