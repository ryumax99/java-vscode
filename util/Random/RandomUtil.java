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
    // 특정 범위의 난수를 생성하기. 실수 -> 정수 형태로 변경.
    // 1 이상 10 이하의 난수를 생성하는 메서드 작성
    public static int generateRandomInRange(int min, int max){
        int randomValue = (int)(Math.random() * ( max - min + 1 )) + min;
        return randomValue;
    }
    public static void generateLottoNumbers() {
        int n1 = generateRandomInRange(1, 45);
        int n2;
        do {
            n2 = generateRandomInRange(1, 45);
        } while (n2 == n1); // 중복 체크
        int n3;
        do {
            n3 = generateRandomInRange(1, 45);
        } while (n3 == n1 || n3 == n2); // 중복 체크
        int n4;
        do {
            n4 = generateRandomInRange(1, 45);
        } while (n4 == n1 || n4 == n2 || n4 == n3); // 중복 체크
        int n5;
        do {
            n5 = generateRandomInRange(1, 45);
        } while (n5 == n1 || n5 == n2 || n5 == n3 || n5 == n4); // 중복 체크
        int n6;
        do {
            n6 = generateRandomInRange(1, 45);
        } while (n6 == n1 || n6 == n2 || n6 == n3 || n6 == n4 || n6 == n5); // 중복 체크
        System.out.println("이상용의 자동 로또 번호 생성기 사용한 번호 : "
                + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6);

    }

}
