package d250616.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _1JDBC_Connection_Test1 {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println("teste");
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 디비 서버 아이피, 포트, 서비스 이름
        String user = "scott2"; // 접속할 유저
        String password = "tiger"; // 패스워드

        // 디비 서버에 네트워크 연결 요청을 해서, try ~ catch, try ~ resource 구문을 이용하기.
        try (Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select sysdate from dual")) {
            if (rs.next()) {
                System.out.println("현재 시간 : " + rs.getTimestamp(1));
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    }

