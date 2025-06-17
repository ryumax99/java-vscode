package d250617.web_structure.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import d250617.web_structure.dto.*;
import d250617.web_structure.util.*;

// 인터페이스를 구현한 구현체 클래스, JDBC 연결한 기능들 재정의, DAO
public class _N1OracleMemberDAOImpl implements _9DAO_Interface {
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    @Override
    public List<_10Member> findAll() {
        // Select 부분 벤치마킹
        // JDBC 실행 순서
        // 1. 디비 서버에 접근을 위한 준비물.
        // 1) 드라이버 위치 2) 유저명 3) 패스워드 4) 디비서버의 아이피 및 포트 번호
        // 분리
        List<_10Member> memberList = new ArrayList<>();
        try {
            conn = _4DBConnectionManager.getConnection();
            String query = "SELECT * FROM MEMBER501 ORDER BY ID DESC";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password2 = rs.getString("password");
                String reg_Date = rs.getString("reg_Date");
                _10Member member = new _10Member(id, name, email, password2, reg_Date);
                memberList.add(member);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            _4DBConnectionManager.close(null, pstmt, conn);
        }
        return memberList;
    }

    @Override
    public _10Member findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean insert(_10Member member) {

        try {
            conn = _4DBConnectionManager.getConnection();

            String query = "INSERT INTO MEMBER501 (ID,NAME,PASSWORD,EMAIL,REG_DATE)" +
                    "VALUES(MEMBER501_SEQ.NEXTVAL,?,?,?,?)";

            // 5. PreparedStatement 생성
            // 요청할 SQL 문을 데이터베이스 전송할 때 사용하는 기능(API)
            // 예) PreparedStatement pstmt = conn.prepareStatement(query)
            pstmt = conn.prepareStatement(query);
            // 추가할 데이터를 ,해당 와일드카드(?) 에 해당하는 데이터 임시로 하드코딩으로 넣고 있고,
            

            // 시퀀스 이용해서, 자동 순번으로 넣을 경우.
            // 변경전
            // pstmt.setString(1, "이상용");
            // pstmt.setString(2, "1234");
            // pstmt.setString(3, "lsy@naver.com");
            // pstmt.setString(4, DateUtil.getCurrentDateTime());
            // System.out.println("5. PreparedStatement 생성 완료");
            // 변경 후
            // 화면에서 데이터를 사용자로부터 받아서 추가 할 예정.
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getPassword());
            pstmt.setString(3, member.getEmail());
            pstmt.setString(4, DateUtil.getCurrentDateTime());
            System.out.println("5. PreparedStatement 생성 완료");

            // 6. SQL 문 전송 및 결과값 얻기, 1) 조회 버전: executeQuery,
            // 2) 쓰기, 수정, 삭제 :executeUpdate()
            // 조회 버전
            // 예) ResultSet rs = pstmt.executeQuery(query)
            // ResultSet : 가상의 테이블, 데이터 베이스에서 조회된 데이터를 테이블 형식으로 메모리상에 저장.
            // 0 행 부터 시작 함.
            // 예) while(rs.next()){ // 0행 시작 -> 1행의 데이터가 존재 하면, 가져올 작업한다.
            // int id = rs.getInt("id");
            // String name = rs.getString("name");

            // 쓰기 버전,
            // int result = pstmt.executeUpdate(query)
            System.out.println("6. 전송 전 완료");
            int result = pstmt.executeUpdate(query);
            System.out.println("6-2. 전송 후 완료");
            System.out.println(result + " 개의 데이터가 저장됨");
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password2 = rs.getString("password");
                String reg_Date = rs.getString("reg_Date");
                _10Member member = new _10Member(id, name, email, password2, reg_Date);
                memberList.add(member);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            _4DBConnectionManager.close(null, pstmt, conn);
        }
        return true;
    }
    

    @Override
    public boolean update(_10Member member) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public _10Member findByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByName'");
    }

    

    

}
