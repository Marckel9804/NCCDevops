package org.Ncc.Mar.t12.SocketExample;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {




    public static void main(String[] args) {
        Socket socket;
        try {
            socket = new Socket();
            System.out.println("연결 요청...");

            //1. 서버에 연결 요청
            socket.connect(new InetSocketAddress("localhost",5001));

            //연결이 됬다면
            byte[]   b = null;
            String message = null;

            //2. 소켓으로부터 outputStream으로 보내기
            OutputStream os = socket.getOutputStream();
            message = "Hi Server"+socket;
            b = message.getBytes("UTF-8");
            os.write(b);
            System.out.println("데이터 보내기 성공!");

            os.close();
            socket.close();

            //3. 서버로부터 데이터 받기
            InputStream is = socket.getInputStream();
            b=new byte[100];
            int r=is.read(b);
            //메시지 바이트 배열 읽는다.
            message=new String(b,0,r,"UTF-8");
            //바이트 배열을 문자열로 바꾼다.
            System.out.println("데이터 받기 성공");

            is.close();
            os.close();
            socket.close();
        } catch (Exception e ){}
    }
}
