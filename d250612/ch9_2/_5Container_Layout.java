package d250612.ch9_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class _5Container_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("복합 패널 레이아웃 적용 예시");
        JPanel northpanel = new JPanel(new FlowLayout());
        northpanel.add(new JButton("샘플버튼1"));
        northpanel.add(new JButton("샘플버튼2"));

        JPanel centerJPanel = new JPanel(new GridLayout(2,1));
        centerJPanel.add(new JButton("샘플 버튼3"));
        centerJPanel.add(new JButton("샘플 버튼4"));


        frame.setLayout(new BorderLayout());
        
        frame.add(northpanel, BorderLayout.NORTH);
        frame.add(centerJPanel, BorderLayout.CENTER);


        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
