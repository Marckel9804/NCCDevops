package org.Ncc.Mar.t22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTest1 {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        String url="jdbc:mysql://localhost:3306/jdbc_book";
        String id = "root"; String pw = "1234";
        try {
            System.out.println("1");
            // Class 클래스로 JDBC 드라이버 로딩
            Class.forName("com.mysql.jdbc.Driver");
            // 실행하면 DriverManager에 등록된다.

            // 데이터베이스 연결 -> Connection 객체 생성
            con = DriverManager.getConnection(url,id,pw);

            String query = "insert into users values(?,?,?,?,?)";
            // or        = "insert into users"
            //             + "values(userid,username,password,age,email)";

            PreparedStatement ps = con.prepareStatement(query);
            // ? : 바인드 변수 -> 값을 바꿀 경우를 위해 미리 값을 정해놓지 않음
            // setXXX(순서, 데이터)
            ps.setString(1,"hong");
            ps.setString(2, "kk");
            ps.setString(3, "1234");
            ps.setInt(4, 24);
            ps.setString(5,"hong@naver.com");

            // excuteXXXXX : 쿼리문 DB에 실행하는 메소드
            int r = ps.executeUpdate();

            System.out.println(r);

            ps.close();


        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        con.close();
    }
}
