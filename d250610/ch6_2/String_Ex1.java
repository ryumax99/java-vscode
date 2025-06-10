package d250610.ch6_2;

public class String_Ex1 {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Java");

        String str3 = str + "Hi~~";

        System.out.println("str 임시 메모리 주소 확인" + System.identityHashCode(str));
        System.out.println("str 임시 메모리 주소 확인" + System.identityHashCode(str2));
        System.out.println("str 임시 메모리 주소 확인" + System.identityHashCode(str3));

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" Hi~~");
        String result = sb.toString();
        System.out.println("업그레이가 된 StringBuffer 클래스 이용시 : 메모리 주소확인 " + System.identityHashCode(sb));
        System.out.println("결과물 확인 " + result);
    }

}
