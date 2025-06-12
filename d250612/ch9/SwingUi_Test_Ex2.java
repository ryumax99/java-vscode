package d250612.ch9;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingUi_Test_Ex2 {
    public static void main(String[] args) {
        // Jframe 안에 버튼 추가
        JFrame frame = new JFrame("버튼 테스트");
        // 버튼 객체 필요
        JButton button = new JButton("Click");
        // 버튼을 프레임에 붙이기 작업.
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
