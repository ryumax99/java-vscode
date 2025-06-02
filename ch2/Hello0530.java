package ch2;

public class Hello0530 {
    public static void main(String[] args) {
        System.out.println("test");
        String myinfo = Introduce.introduce("류성원", "010-1234-5678", "aaa@aaa.com");
        System.out.println(myinfo);
        String fav = Introduce.favorite("초밥", "유튜브시청", "롤");
        System.out.println(fav);
        // 퀴즈 1
        // Introduce 클래스에, 정의한 사칙연산 메소드를 이용해서, 각각 계산 결과를
        // result1, result2, result3, result4 변수에 담아서, 출력해보기
        int result1 = Introduce.sum(10, 20);
        int result2 = Introduce.mul(4, 5);
        int result3 = Introduce.sub(10, 3);
        int result4 = Introduce.div(8, 2);
        System.out.println(" sum을 이용한 값 : " + result1
        + ", mul을 이용한 값 : " + result2 
        + ", sub를 이용한 값 : " + result3 
        + ", div를 이용한 값 : " + result4);
    }
}
