package org.Ncc.Mar.t22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserSelect {
    public static void main(String[] args) {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/jdbc_book";
        String id = "root"; String pw = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, id, pw);

            String sql = "select * from users where userid= ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "com");

            //ResultSet: 반환값이 여러 개의 형인 경우에 쉽게 처리할 수 있게 설계된 클래스
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                User user = new User();
                // rs 인덱스에 처음 들어가 있는
                user.setUserid(rs.getString(1));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAge(rs.getInt("age"));
                user.setEmail(rs.getString("email"));

                System.out.println(user);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
