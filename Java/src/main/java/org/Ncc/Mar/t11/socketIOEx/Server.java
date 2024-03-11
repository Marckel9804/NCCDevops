package org.Ncc.Mar.t11.socketIOEx;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        //1번 서버 소켓 생성
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(9999);
            System.out.print("서버 기다리는 중....");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //3번 서버 소켓 accept() -> 요청 수락
        //4번 소켓 생성
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                System.out.println("클라이언트와 연결 성공!!!!");

                //7번 클라이언트에서 보낸 정보 받기
                InputStream in = socket.getInputStream();
                DataInputStream dis = new DataInputStream(in);
                String message = dis.readUTF();
                System.out.println(message + "클라이언트가 보냄");

                //클라이언트한테 보내기
                OutputStream os = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeUTF(message);

                dos.close();
                dis.close();
                socket.close();

                System.out.println("소켓 닫음");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
