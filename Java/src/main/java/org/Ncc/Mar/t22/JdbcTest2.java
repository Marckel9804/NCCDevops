package org.Ncc.Mar.t22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class JdbcTest2 {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/jdbc_book";
        String id = "root"; String pw = "1234";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,id,pw);
            String sql = "INSERT INTO boards (btitle, bcontent, bwritter, bdate, bfilename,bfiledata) "
                    + "VALUES (?, ?, ?, now(), ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "금");
            ps.setString(2, "금요일에 만나요");
            ps.setString(3, "ch");
            ps.setString(4, "mococo");
            ps.setBlob(5, new FileInputStream("C:/Users/Changho/Desktop/mococo.jpg"));


            //자동증가된 bno 값 가져옴
            int r = ps.executeUpdate();
            System.out.println(r);

            if(r==1) {
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    int bno = rs.getInt(1);
                    System.out.println("게시글 수" +bno);
                }
                rs.close();
            }

            ps.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        con.close();
    }
}
