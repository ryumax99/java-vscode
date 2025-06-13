package d250613.web_structure.service;

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

import javax.swing.table.DefaultTableModel;
import javax.swing.*;

import d250613.member_project.model.Member;
import d250613.member_project.util.DateUtil;

public class _5MemberService {
    // 파일 불러오는 경로 설정
    private static final String FILE_NAME = "member.txt";
    // 파일 정보 담아둘 임시 공간
    private ArrayList<Member> members = new ArrayList<>();
    //
    // 없는 부분 받아서 임시로 사용하기.
    private DefaultTableModel tableModel;
    private JTextField searchField;

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public void setSearchField(JTextField searchField) {
        this.searchField = searchField;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void addMember(Member member) {
        members.add(member);
        saveMembersToFile();
    }

    // 1) csv 파일에서 회원 목록 불러오기
    public void loadMembersFromFile() {
        members.clear();
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("새로운 파일 생성 : " + FILE_NAME);
            } catch (Exception e) {
                // e.printStackTrace();
                System.out.println("다른 방법으로 알림등 알려줄 예정");
                return;
            }
        }
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                Member member = Member.fromCSV(line);
                if (member != null) {
                    members.add(member);
                }
            }
        } catch (Exception e) {
            System.out.println("다른 방법으로 알림등 알려줄 예정");
        }

    }
    // 파일이 있는 경우
    // 파일에서 한줄씩 읽어서 -> members 리스트에 저장.

    // 2) 회원 목록을 CSV 파일에 저장
    public void saveMembersToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Member member : members) {
                bw.write(member.toCSV());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("다른 방법으로 알림등 알려줄 예정");
        }
    }

    // 더미 데이터 추가하는 기능.
    // 화면이 필요 없음.
    public void dummyMake() {

        // 반복문으로 더미 데이터 10개 정도 넣기.
        for (int i = 0; i < 10; i++) {
            Member dummyMember = new Member(
                    "더미회원" + (i + 1),
                    "password" + (i + 1),
                    "dummy" + (i + 1) + "@example.com",
                    DateUtil.getCurrentDateTime());
            members.add(dummyMember);
        }

        saveMembersToFile();
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
        for (Member member : members) {
            tableModel.addRow(new Object[] {
                    member.getName(), member.getEmail(), member.getPassword(),
                    member.getRegDate()
            });
        }
    }

    // 4) 검색 결과를 테이블에 반영
    public void showSearchResults(ArrayList<Member> results) {
        tableModel.setRowCount(0);
        for (Member member : members) {
            tableModel.addRow(new Object[] {
                    member.getName(), member.getEmail(), member.getPassword(),
                    member.getRegDate()
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
        ArrayList<Member> resultList = new ArrayList<>();
        for (Member member : members) {
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
