package d250611.ch8_3;

import java.io.File;

// 파일 객체 생성해서, 파일/폴더 존재 여부 확인, 정보 읽기
// 파일/폴더 생성, 삭제, 목록 조회

public class FileTest_Ex1 {
    public static void main(String[] args) {
        // data.txt 가 존재하는지 확인.
        File file = new File("test.txt");
        System.out.println("파일의 존재 여부 " + file.exists());       
    }
}
