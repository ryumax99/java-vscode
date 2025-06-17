package d250617.web_structure.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import d250617.web_structure.dao._9DAO_Interface;
import d250617.web_structure.dao._N1OracleMemberDAOImpl;
import d250617.web_structure.dto._10Member;
import d250617.web_structure.ui._4SignupFrame;

import javax.swing.*;

public class _5MemberService {
    // 파일 불러오는 경로 설정
    _9DAO_Interface dao = new _N1OracleMemberDAOImpl();
    
    // DB에서 불러온 멤버의 모든 정보를 담아둘 임시 공간
    private List<_10Member> members = new ArrayList<>();
    //
    // 없는 부분 받아서 임시로 사용하기.
    private DefaultTableModel tableModel;

    private JTextField searchField;

    public void setSignupFrame(_4SignupFrame signupFrame) {
        this.signupFrame = signupFrame;
    }

    private _4SignupFrame signupFrame;

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public void setSearchField(JTextField searchField) {
        this.searchField = searchField;
    }

    public List<_10Member> getMembers() {
        return members;
    }

    // 0617 변경전
    public void addMember(_10Member member) {
        members.add(member);
        // saveMembersToFile();
    }

    // 0617 변경후
    public void addMemberDB(_10Member member) {
        boolean result = dao.insert(member);
        
    }

    // 0617 회원 수정시 한명의 정보를 가져오는 기능
    public _10Member getMemberOne(int member_id) {
        _10Member member = dao.findById(member_id);
        return member;
    }

    // 0617 회원 수정 해서 db 반영
    // 0617 디버깅 2
    public void updateMember(_10Member member) {
        System.out.println("회원 수정 파일 데이터 확인");
        System.out.println(member);
        dao.update(member);
    }

    // 순서 3
    // 1) 디비에서 회원 목록 불러오기
    public void loadMembersFromDB() {
        members.clear();
        members = dao.findAll();
        try {
            members = dao.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    // 파일이 있는 경우
    // 파일에서 한줄씩 읽어서 -> members 리스트에 저장.

    // 2) 회원 목록을 CSV 파일에 저장
    // public void saveMembersToFile() {
    //     try (BufferedWriter bw = new BufferedWriter(
    //             new OutputStreamWriter(new FileOutputStream(FILE_NAME), "UTF-8"))) {
    //         for (_10Member member : members) {
    //             // bw.write(member.toCSV());
    //             bw.newLine();
    //         }
    //     } catch (

    //     Exception e) {
    //         System.out.println("다른 방법으로 알림등 알려줄 예정");
    //     }
    // }

    // 더미 데이터 추가하는 기능.
    // 화면이 필요 없음.
    public void dummyMake() {

        // 반복문으로 더미 데이터 10개 정도 넣기.
        for (int i = 0; i < 10; i++) {
            _10Member dummyMember = new _10Member();
                    // "더미회원" + (i + 1),
                    // "password" + (i + 1),
                    // "dummy" + (i + 1) + "@example.com",
                    // DateUtil.getCurrentDateTime());
            // members.add(dummyMember));
        }

        // saveMembersToFile();
        // 변경사항 새로고침, 즉 다 지우고, 전체 회원을 다시 그리기.
        refreshTable();
        // 10명의 더미 회원 추가 확인 다이얼로그창 띄우기.
        // JOptionPane.showMessageDialog(this, "10명의 더미 회원 추가!!");
        // JOptionPane.showMessageDialog(this, "파일 생성 오류 : " + e.getMessage());
        System.out.println("다른 방법으로 알림등 알려줄 예정");
    }

    // 3) JTable 에 회원 데이터 반영
    public void refreshTable() {
        tableModel.setRowCount(0);
        for (_10Member member : members) {
            tableModel.addRow(new Object[] {
                    // 전
                    // member.getName(), member.getEmail(), member.getPassword(),
                    // member.getRegDate()
                    // 후
                    member.getId(),member.getName(),member.getEmail(),
                    member.getPassword(),member.getReg_Date()
            });
        }
    }

    // 4) 검색 결과를 테이블에 반영
    public void showSearchResults(ArrayList<_10Member> results) {
        tableModel.setRowCount(0);
        for (_10Member member : members) {
            tableModel.addRow(new Object[] {
                    // member.getName(), member.getEmail(), member.getPassword(),
                    // member.getRegDate()
            });
        }
    }

    // 5) 검색 기능 (이름or이메일)
    public void searchMembers() {
        // 검색어 입력창에서 검색어 가져오기
        String query = searchField.getText().trim().toLowerCase();
        // 유효성 체크
        if (query.isEmpty()) {
            refreshTable();
            return;
        }
        // 임시로 담아둘 멤버 리스트 하나 정의
        ArrayList<_10Member> resultList = new ArrayList<>();
        for (_10Member member : members) {
            if (member.getName().toLowerCase().contains(query) ||
                    member.getEmail().toLowerCase().contains(query)) {
                resultList.add(member);
            }
        }
        // 검색된 결과를 화면에 출력하는 메서드에 넘겨주기
        showSearchResults(resultList);

        // 검색된 결과가 없다면 알림창
        if (resultList.isEmpty()) {
            System.out.println("다른 방법으로 알림등 알려줄 예정");
        }

    }
}
