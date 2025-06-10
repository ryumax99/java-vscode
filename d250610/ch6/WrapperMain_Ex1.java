package d250610.ch6;

import java.util.ArrayList;

public class WrapperMain_Ex1 {
    public static void main(String[] args) {
        Integer intObj1 = Integer.valueOf("123");

        Integer[] ints = {intObj1};
        // ArrayList arrayList = new ArrayList<Integer>();
        // arrayList.add(intObj1);
        // arrayList.add(1);

        int num1 = Integer.parseInt("12345");

        // wrapper 객체 -> 기본형
        
        double d = Double.parseDouble("123.0");

        int num2 = Integer.MAX_VALUE;
        int num3 = Integer.MIN_VALUE;

    }
}
