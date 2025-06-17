package d250617.web_structure.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import d250617.web_structure.util.*;
import d250617.web_structure.dto.*;
import d250617.web_structure.service._5MemberService;

public class _4SignupFrame extends JFrame {
    // ==========================================================
    // 추가1

    

    // 검색 관련 컴포넌트
    private JTextField searchField;
    private JButton searchBtn;
    private JButton resetBtn;

    // 테이블 관련 컴포넌트
    private DefaultTableModel tableModel;
    private JTable memberTable;

    // ===========================================================
    // 리팩토리
    private _5MemberService service = new _5MemberService();

    public _4SignupFrame() {
        setTitle("회원가입");
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // =============================================================
        // 추가 2
        // 테이블 작업
        // 테이블 헤더 만들기
        //0617
        //전
        // String[] cols = { "이름", "이메일", "패스워드", "가입일" };
        //후
        String[] cols = { "아이디", "이름", "이메일", "패스워드", "가입일" };
        tableModel = new DefaultTableModel(cols, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        // 추가
        service.setTableModel(tableModel);

        memberTable = new JTable(tableModel); // 표 형태의 데이터를 화면출력용 테이블에 연결
        // 보여주는 테이블에 데이터가 많아지면 스크롤 되게
        JScrollPane scrollPane = new JScrollPane(memberTable);

        // 버튼 있는 패널 생성
        JPanel btnPanel = new JPanel();
        JButton addBtn = new JButton("회원 가입");
        JButton updateBtn = new JButton("수정");
        JButton deleteBtn = new JButton("삭제");
        JButton reloadBtn = new JButton("새로고침");
        // 더미 데이터 버튼
        JButton dummyBtn = new JButton("더미데이터추가");

        btnPanel.add(addBtn);
        btnPanel.add(updateBtn);
        btnPanel.add(deleteBtn);
        btnPanel.add(reloadBtn);
        btnPanel.add(dummyBtn);

        // 검색 패널
        JPanel searchPanel = new JPanel();
        searchField = new JTextField(20);

        // 추가.
        service.setSearchField(searchField);

        searchBtn = new JButton("검색");
        resetBtn = new JButton("검색 초기화");

        // 검색 패널에 버튼 붙이기
        searchPanel.add(new JLabel("이름 또는 이메일 검색 : "));
        searchPanel.add(searchField);
        searchPanel.add(searchBtn);
        searchPanel.add(resetBtn);

        // 레이아웃 배치
        setLayout(new BorderLayout());
        add(searchPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);

        // ===============================================================

        // 파일에서 데이터 불러오고 테이블에 표시
        // service.loadMembersFromFile();
        service.loadMembersFromDB();

        // 새로고침 기능 호출
        service.refreshTable();

        // 각각의 버튼에 기능을 붙이기
        // 회원가입
        addBtn.addActionListener(e -> showAddDialog());
        // 수정
        updateBtn.addActionListener(e -> showAddDialog());
        // 삭제
        deleteBtn.addActionListener(e -> deletSelectedMemberDialog());
        // 새로고침
        reloadBtn.addActionListener(e -> {
            // service.loadMembersFromFile();
            service.refreshTable();
        });
        // 검색
        searchBtn.addActionListener(e -> service.searchMembers());
        // 검색 초기화
        resetBtn.addActionListener(e -> {
            searchField.setText("");
            service.refreshTable();
        });
        // 검색어에서, 엔터를 입력해도, 실행이 되게끔.
        searchField.addActionListener(e -> service.searchMembers());

        // 더미 데이터 기능 추가 이벤트 리스너 연결.
        dummyBtn.addActionListener(e -> service.dummyMake());

        // 안내 문구 표시
        // JLabel label = new JLabel("여기는 회원 가입 화면입니다.", JLabel.CENTER);
        // add(label);
        // ===============================================================
    }

    // ===============================================================
    // 각 기능들 정의
    

    // 6) 회원 가입 입력 폼, 다이얼 로그 창으로 작업,
    private void showAddDialog() {
        JTextField nameField = new JTextField(10);
        JTextField emailField = new JTextField(15);
        JTextField passwordField = new JTextField(10);

        // 행을 0으로 할경우 자동 생성
        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("이름 : "));
        panel.add(nameField);

        panel.add(new JLabel("이메일 : "));
        panel.add(emailField);

        panel.add(new JLabel("패스워드 : "));
        panel.add(passwordField);

        // 회원가입 버튼을 누를 경우, 확인 알림창 띄우기.
        // 확인 버튼 클릭
        int result = JOptionPane.showConfirmDialog(
                this, // 알림창 위치
                panel, // 보여줄 컨텐츠
                "회원 가입", // 제목창
                JOptionPane.OK_CANCEL_OPTION, // 확인 취소를 구성함
                JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = passwordField.getText().trim();
            String regDate = DateUtil.getCurrentDateTime();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "모든 항목을 입력해주세요. ");
                return;
            }
            
            // _10Member member = new _10Member(0,name, email, password, regDate);
            // 변경전
            // service.addMember(member);
            // 변경후
            // 1) 회원가입 화면에서 넘겨 받은 데이터 -> member 객체 생성
            // 매개변수에서 id 부분은 큰 의미가 없다.
            _10Member member = new _10Member(0, name, email, password, regDate);
            // 2) insert 메서드에 입력받은 데이터 전달
            
            // service.saveMembersToFile();
            // 변경사항 새로고침, 즉 다 지우고, 전체 회원을 다시 그리기.
            service.refreshTable();
        }
    }

    // 7) 회원 수정 창
    private void showUpdateDialog() {
        // 테이블 상에서 , 선택된 행의 번호를 가져와서 수정 작업
        int row = memberTable.getSelectedRow();
        // 유효성 체크
        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "수정 할 회원을 선택해주세요. ");
            return;
        }
        _10Member oldMember = service.getMembers().get(row);

        // 기존 회원의 정보를 불러오고 필요한 부분만 수정
        JTextField nameField = new JTextField(oldMember.getName(), 10);
        JTextField emailField = new JTextField(oldMember.getEmail(), 15);
        JTextField passwordField = new JTextField(oldMember.getPassword(), 10);

        // 행을 0으로 할경우 자동 생성
        JPanel panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("이름 : "));
        panel.add(nameField);

        panel.add(new JLabel("이메일 : "));
        panel.add(emailField);

        panel.add(new JLabel("패스워드 : "));
        panel.add(passwordField);

        // 회원가입 버튼을 누를 경우, 확인 알림창 띄우기.
        // 확인 버튼 클릭
        int result = JOptionPane.showConfirmDialog(
                this, // 알림창 위치
                panel, // 보여줄 컨텐츠
                "회원 정보 수정", // 제목창
                JOptionPane.OK_CANCEL_OPTION, // 확인 취소를 구성함
                JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = passwordField.getText().trim();
            String regDate = DateUtil.getCurrentDateTime();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "모든 항목을 입력해주세요. ");
            }
            // 가입시
            // Member member = new Member(name, password, email, regDate);
            // 수정
            oldMember.setName(name);
            oldMember.setEmail(email);
            oldMember.setPassword(password);
            // oldMember.setRegDate(regDate);
            // service.saveMembersToFile();
            // 변경사항 새로고침, 즉 다 지우고, 전체 회원을 다시 그리기.
            service.refreshTable();
        }
    }

    // 8) 회원 삭제.
    private void deletSelectedMemberDialog() {
        // 테이블 상에서 , 선택된 행의 번호를 가져와서 수정 작업
        int row = memberTable.getSelectedRow();
        // 유효성 체크
        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "삭제 할 회원을 선택해주세요. ");
            return;
        }

        // 회원가입 버튼을 누를 경우, 확인 알림창 띄우기.
        // 확인 버튼 클릭
        int result = JOptionPane.showConfirmDialog(
                this, // 알림창 위치
                "정말 삭제 하시겠습니까?", // 보여줄 컨텐츠
                "회원 삭제", // 제목창
                JOptionPane.YES_NO_OPTION // 확인 취소를 구성함
        );

        if (result == JOptionPane.YES_OPTION) {
            // 리스트에 해당 멤버 삭제,
            // members.remove(row);
            service.getMembers().remove(row);
            // service.saveMembersToFile();
            // 변경사항 새로고침, 즉 다 지우고, 전체 회원을 다시 그리기.
            service.refreshTable();
        }
    }

    // ===============================================================
}
