package d250612.ch9;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class SwingUi_Test_Ex5 {
    public static void main(String[] args) {
        // 프레임 안에 닫기 버튼을 추가해서 이벤트 처리를 클릭시(이벤트 핸들러), 닫기 기능 구현해보기
        JFrame frame = new JFrame("닫기 버튼 이벤트 추가");
        JButton button = new JButton("닫기");
        // 이벤트 리스너 작업
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}
