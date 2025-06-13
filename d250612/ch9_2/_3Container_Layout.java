package d250612.ch9_2;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _3Container_Layout {
    // GridLayout 예시
     public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout 예시");
        JPanel panel = new JPanel();

        frame.setLayout(new GridLayout(2,2));
        frame.add(new JButton("샘플1"));
        frame.add(new JButton("샘플2"));
        frame.add(new JButton("샘플3"));
        frame.add(new JButton("샘플4"));
        frame.add(panel);


        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
