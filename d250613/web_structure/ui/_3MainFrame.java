package d250613.web_structure.ui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _3MainFrame extends JFrame {
    public _3MainFrame() {
        setTitle("메인 화면");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton signUpBtn = new JButton("회원가입");
        signUpBtn.addActionListener(e -> {
            new _4SignupFrame();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(signUpBtn);
        add(panel,BorderLayout.CENTER);
        setVisible(true); 
    }
}
