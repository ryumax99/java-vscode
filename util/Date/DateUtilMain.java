package util.date;

public class DateUtilMain {
    public static void main(String[] args) {
        System.out.println("현재 시간을 불러오는 기능 확인.");
        String currentTime = DateUtil.getCurrentDateTime();
        System.out.println("현재 시간 : " + currentTime);
    }
}
