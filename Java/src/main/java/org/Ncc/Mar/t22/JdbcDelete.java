package org.Ncc.Mar.t22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDelete {
    public static void main(String[] args) {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/jdbc_book";
        String id = "root"; String pw = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,id,pw );

            String sql = new StringBuilder()
                    .append("DELETE FROM boards WHERE bno = 1;")
                    .toString();
            PreparedStatement ps = con.prepareStatement(sql);

            int r = ps.executeUpdate();
            System.out.println("수정된 행 개수"+r);
            ps.close();
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
