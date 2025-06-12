package d250612.ch9;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingUi_Test_Ex7 {
    public static void main(String[] args) {
        // JTextArea 여러 줄을 입력 받을 수 있는 창
        // 저장 버튼 클릭시 , 출력
        JFrame frame = new JFrame("메모 입력시 콘솔에 출력");
        JTextArea textArea = new JTextArea(10,30);
        JButton saveButton = new JButton("저장");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea.getText());
            }
        });
        // 화면에 붙이기 작업,
        JPanel panel = new JPanel();
        // 패널에 , 텍스트 영역 추가시, 범위를 넘어가면 스크롤이 생기는 기능 추가.
        panel.add(new JScrollPane(textArea));
        panel.add(saveButton);
        frame.add(panel);
        // 창 크기, 창 닫기시 종료, 창 보이기 , 1세트
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
