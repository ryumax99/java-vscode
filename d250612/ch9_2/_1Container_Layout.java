package d250612.ch9_2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _1Container_Layout {
    public static void main(String[] args) {
        // Jpanel + FlowLayout
        JFrame frame = new JFrame("FlowLayout 예시");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("샘플 버튼1"));
        panel.add(new JButton("샘플 버튼2"));
        panel.add(new JButton("샘플 버튼3"));
        panel.add(new JButton("샘플 버튼4"));
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
