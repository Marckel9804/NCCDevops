package org.Ncc.Mar.t22;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;

public class BoardSelect {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/jdbc_book";
        String id = "root"; String pw = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, id, pw);

            String sql = "select * from boards where bno= ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "2");

            //ResultSet: 반환값이 여러 개의 형인 경우에 쉽게 처리할 수 있게 설계된 클래스
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                Board board = new Board();
                // rs 인덱스에 처음 들어가 있는
                board.setBno(rs.getInt(1));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwritter(rs.getString("bwritter"));
                board.setBdate(rs.getDate("bdate"));
                board.setBfilename(rs.getString("bfilename"));
                board.setBfiledata(rs.getBlob("bfiledata"));


                System.out.println(board);

                Blob b = board.getBfiledata();
                if(b!=null) {
                    InputStream is = b.getBinaryStream();
                    OutputStream os = new FileOutputStream("C://Users/Changho/Desktop/네클캠/b"+board.getBfilename()+".jpg");
                    is.transferTo(os);
                    os.flush();
                    os.close();
                    is.close();
                }
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
