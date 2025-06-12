package d250612.ch9;

import javax.swing.JFrame;

public class SwingUi_Test_Ex1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello GUI 창 제목");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
