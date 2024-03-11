package org.Ncc.Mar.t11.socketIOEx;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        //2번 클라이언트 소켓 생성
        try {
            Socket socket = new Socket("127.0.0.1",9999 );
            System.out.println("연결 성공!!!");

            Scanner sc = new Scanner(System.in);
            String messsage = sc.nextLine();

            //5번 server에 전송
            //output 스트림을 거쳐야함
            OutputStream out = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            dos.writeUTF(messsage);

            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String msg = dis.readUTF();
            System.out.println(msg+"서버가 보냄");

            dis.close();
            dos.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
