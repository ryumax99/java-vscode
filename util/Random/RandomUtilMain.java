package util.random;

import java.util.Arrays;

public class RandomUtilMain {
    //메인 메소드가 있는 클래스, 실행용 클래스
    public static void main(String[] args) {
        System.out.println("Math.random()를 사용하여 생성된 난수 " + RandomUtil.generateRandom());
        System.out.println("1이상 10 이하 사이의 랜덤 정수 " + RandomUtil.generateRandomInRange(1, 10) );
        System.out.println("로또 번호 " );
        RandomUtil.generateLottoNumbers();
    }
    
}
