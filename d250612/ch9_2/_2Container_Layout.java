package d250612.ch9_2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _2Container_Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoarderLayout 예시");
        frame.setLayout(new BorderLayout());
        frame.add(new JButton("샘플 버튼 북"),BorderLayout.NORTH);
        frame.add(new JButton("샘플 버튼 남"),BorderLayout.SOUTH);
        frame.add(new JButton("샘플 버튼 중앙"),BorderLayout.CENTER);
        frame.add(new JButton("샘플 버튼 서"),BorderLayout.WEST);
        frame.add(new JButton("샘플 버튼 동"),BorderLayout.EAST);



        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
