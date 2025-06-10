package d250610.ch6;

public class ObjectMain_Ex1 {
    public static void main(String[] args) {
        Object_Ex1 obj = new Object_Ex1("ryu");
        String result = obj.toString();
        System.out.println("부모 클래스의 기본 기능 toString() 확인결과 : " + result);
    }
}
