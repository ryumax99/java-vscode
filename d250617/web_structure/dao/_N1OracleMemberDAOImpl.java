package d250617.web_structure.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import d250617.web_structure.dto.*;
import d250617.web_structure.util.*;
import d250617.web_structure.dao.*;

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
    public _10Member findById(int member_id) {
        // 한명의 회원을 조회하는 작업.
        _10Member member = new _10Member(); // 빈 객체
        try {
            conn = _4DBConnectionManager.getConnection();
            String query = "SELECT * FROM MEMBER501 WHERE ID = ?";
            pstmt = conn.prepareStatement(query);
            // 0617 변경전
            // pstmt.setInt(1, 2);

            // 0617 변경후
            pstmt.setInt(1, member_id);
            rs = pstmt.executeQuery();            
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password2 = rs.getString("password");
                String reg_date = rs.getString("reg_date");
                member.setId(id);
                member.setName(name);
                member.setEmail(email);
                member.setPassword(password2);
                member.setReg_Date(reg_date);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            _4DBConnectionManager.close(null, pstmt, conn);
        }
        return member;
    }

    @Override
    public boolean insert(_10Member member) {

        try {
            conn = _4DBConnectionManager.getConnection();

            // 만약 , 자동 인덱스 생성으로 추가 할 경우
            String query = "INSERT INTO MEMBER501 (ID,NAME,PASSWORD,EMAIL,REG_DATE)" +
                    "VALUES(MEMBER501_SEQ.NEXTVAL,?,?,?,?)";

            // 5. PreparedStatement 생성
            // 요청할 SQL 문을 데이터베이스 전송할 때 사용하는 기능(API)
            // 예) PreparedStatement pstmt = conn.prepareStatement(query)
            pstmt = conn.prepareStatement(query);
            // 추가할 데이터를 ,해당 와일드카드(?) 에 해당하는 데이터 임시로 하드코딩으로 넣고 있고,
            // 화면에서 데이터를 사용자로부터 받아서 추가 할 예정.

            // 시퀀스 이용해서, 자동 순번으로 넣을 경우.
            // 0617 , 회원 가입 변경 전
            // pstmt.setString(1, "이상용");
            // pstmt.setString(2, "1234");
            // pstmt.setString(3, "lsy@naver.com");
            // pstmt.setString(4, DateUtil.getCurrentDateTime());

            // 0617 , 회원 가입 변경 후 ->
            // 화면에서 데이터를 사용자로부터 받아서 -> member 담아져 있음. -> 여기서 꺼내서 사용하기.
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getPassword());
            pstmt.setString(3, member.getEmail());
            pstmt.setString(4, DateUtil.getCurrentDateTime());
            System.out.println("5. PreparedStatement 생성 완료");

            // 6. SQL 문 전송 및 결과값 얻기, 1) 조회 버전: executeQuery,
            // 쓰기 버전,
            int result = pstmt.executeUpdate(); // 실제로 디비에 쓰기 작업 진행.
            System.out.println(result + " 개의 데이터가 저장됨");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            _4DBConnectionManager.close(null, pstmt, conn);
        }
        return true;
    }
    

    @Override
    public boolean update(_10Member member) {
        try {
            conn = _4DBConnectionManager.getConnection();

            // 만약 , 자동 인덱스 생성으로 추가 할 경우
            String query = "UPDATE MEMBER501 SET NAME = ?, EMAIL = ?," +
             "PASSWORD = ?, REG_DATE = ? WHERE ID = ?";

            pstmt = conn.prepareStatement(query);
            

            // 시퀀스 이용해서, 자동 순번으로 넣을 경우.
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getPassword());
            pstmt.setString(3, member.getEmail());
            pstmt.setString(4, DateUtil.getCurrentDateTime());
            pstmt.setInt(5, 1);
            

            

            
            System.out.println("6. 전송 전 완료");
            int result = pstmt.executeUpdate();
            System.out.println("6-2. 전송 후 완료");
            System.out.println(result + " 개의 데이터가 저장됨");

        } catch (Exception e) {
            
        } finally {
            
            _4DBConnectionManager.close(null, pstmt, conn);
        }   
        return true;        
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
