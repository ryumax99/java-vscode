package util.Random;

public class RandomUtil {
    // 설계 클래스
    // Math 클래스에 있는 tandom() 메소드를 사용하여
    // 0.0 이상 1.0 미만의 난수를 생성하는 메소드를 작성
    // 기본 기능 확인용, 정적 메서드 추가해보기
    public static double generateRandom() {
        double randomValue = Math.random();
        return randomValue;
    }
}
