package d250612.ch9;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingUi_Test_Ex3 {
    public static void main(String[] args) {
        // 프레임에 라벨 붙이기
        JFrame frame = new JFrame("라벨 붙이기 예시");
        JLabel jLabel = new JLabel("Hello 스윙의 Jlabel");
        frame.add(jLabel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
