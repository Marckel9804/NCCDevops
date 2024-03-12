package org.Ncc.Mar.t12.SocketExample;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        try {
            //1. 서버소켓 생성
            serverSocket = new ServerSocket();
            //bind로 해보기
            //2. 서버소켓과 서버소켓이 연결될 ip주소와 포트번호
            serverSocket.bind(new InetSocketAddress("localhost", 5001));
            while (true) {
                System.out.println("연결이 되기를 기다림");

                //3. 연결 요청 수락
                Socket socket = serverSocket.accept();

                //4. 보내진 데이터 받기
                InputStream is = socket.getInputStream();
                byte b[]=null;
                String message = null;

                //요부분 멀까나
                int r = is.read(b);
                message = new String(b,0,r,"UTF-8");
                System.out.println("데이터 받기 성공!");

                //5. 클라이언트에 메세지 전송
                OutputStream os=socket.getOutputStream();
                message="Hi Client";
                b=message.getBytes("UTF-8");
                //문자열을 바이트로 변경해서 전송하겠다.
                os.write(b);
                System.out.println("데이터 보내기 성공");

                os.close();
                is.close();
                socket.close();
                serverSocket.close();
            }

        } catch (Exception e) {

        }
    }
}
