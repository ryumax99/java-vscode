package d250617.web_structure.ui;

import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class _2IntroFrame extends JFrame {
    // 실행 클래스가 아니라, 설계 클래스 이므로,
    // 생성자에 필요한 기능을 넣고 
    // 이 클래스의 기본 생성자를 호출(인스턴스 생성시) 동작하게끔 하는 원리
    public _2IntroFrame() {
        setTitle("인트로 화면 예시"); // 창 제목
        setSize(400,200); // 창 크기
        setLocationRelativeTo(null); // 화면 중앙 배치 기능.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 안내 문구 표시
        JLabel label = new JLabel("환영합니다 3초후 메인 이동합니다", JLabel.CENTER);
        add(label);
        // 화면에 보이기
        setVisible(true);

        // 3초 후에 다른 화면으로 이동하는 기능, 타이머 기능 사용하기.
        Timer timer = new Timer(3000,
        e -> {
            new _3MainFrame();
            dispose();
        });
        timer.setRepeats(false);
        timer.start();
    }    
}
