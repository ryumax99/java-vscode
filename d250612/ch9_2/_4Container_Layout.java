package d250612.ch9_2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class _4Container_Layout {
    // BorderLayout 이용해서, 북: 제목, 중앙 : 
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoarderLayout 예시");
        frame.setLayout(new BorderLayout());
        frame.add(new JLabel("제목",SwingConstants.CENTER),BorderLayout.NORTH);
        frame.add(new JTextArea(5,20),BorderLayout.CENTER);
        frame.add(new JButton("저장"),BorderLayout.SOUTH);
        



        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
