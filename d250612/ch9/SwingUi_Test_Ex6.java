package d250612.ch9;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingUi_Test_Ex6 {
    public static void main(String[] args) {
        // 이름 입력이라는 라벨, 텍스트 필드
        JFrame frame = new JFrame("이름 입력 필드 예시");
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("이름 입력");
        JTextField jTextField = new JTextField(10);
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        frame.add(jPanel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}
