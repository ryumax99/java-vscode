package d250612.ch9_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class _6Container_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("회원가입 간단 구조 예시");
        frame.setLayout(new BorderLayout());
        frame.add(new JLabel("회원 가입", SwingConstants.CENTER), BorderLayout.NORTH);
        
        JPanel centerpanel = new JPanel(new GridLayout(2, 2));
        centerpanel.add(new JLabel("이름"));
        centerpanel.add(new JTextField(20));
        centerpanel.add(new JLabel("패스워드"));
        centerpanel.add(new JTextField(20));

        frame.add(new JButton("가입"), BorderLayout.SOUTH);
        frame.setLayout(new BorderLayout());

        // 프레임에 -> 패널 붙이기 작업,
        frame.add(centerpanel, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
