package d250612.ch9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// 내부클래스
// 클래스 안에 또 다른 클래스를 정의하고, 사용

public class InnerClass_Anonymous_Lambda {
    JFrame frame = new JFrame("내부 클래스 예시");
    JButton button = new JButton("닫기");

    public InnerClass_Anonymous_Lambda() {
        // 버튼에 , 이벤트 리스너 붙이기
        button.addActionListener(new SampleListener());
        // 화면에 버튼 붙이기 작업,
        frame.add(button);
        // 창 크기, 창 닫기시 종료, 창 보이기 , 1세트
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class SampleListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }

    }
    public static void main(String[] args) {
        new InnerClass_Anonymous_Lambda();
    }
}
