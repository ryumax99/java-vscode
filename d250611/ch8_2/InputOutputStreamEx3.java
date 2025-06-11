package d250611.ch8_2;

import java.io.FileInputStream;

public class InputOutputStreamEx3 {
    public static void main(String[] args) {
        // 파일에서 한 바이트씩 읽어 화면에 출력
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data; // 한 바이트씩 읽어서 임시로 담을 변수
            while ((data = fis.read()) != -1) { // 파일 안의 데이터를 다 읽을 때 까지 반복.
                System.out.println((char)data);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
