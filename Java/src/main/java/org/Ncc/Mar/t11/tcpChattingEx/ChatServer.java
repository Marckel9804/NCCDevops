package org.Ncc.Mar.t11.tcpChattingEx;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ChatServer {
    //HashMap으로 클라이언트들 객체 생성
    HashMap clients;
    ChatServer(){
        clients = new HashMap();
        Collections.synchronizedMap(clients);
    }

    public void start() throws IOException {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("서버 시작....");

            while (true) {
                socket =serverSocket.accept();
                System.out.println(socket.getInetAddress()+
                        " " + socket.getPort());
                //Receiver 클래스 생성 public void run()
                Receiver thread = new Receiver(socket);
                //class Receiver extends Thread
                thread.start();

            }
        } catch (Exception e){

        }
    }

    void sendAll(String message) throws IOException{
        Iterator iterator = clients.keySet().iterator();
        while (iterator.hasNext()) {
            try {
                DataOutputStream dos =(DataOutputStream) clients.get(iterator.next());
                dos.writeUTF(message);
            } catch (Exception e) {}
        }
    }
    public static void main(String[] args) throws IOException {
        new ChatServer().start();

    }

    //스레드 생성을 위해 내부 클래스 생성
    class Receiver extends Thread {
        Socket socket;
        DataInputStream dis =null;
        DataOutputStream dos;

        Receiver (Socket socket) {
            this.socket = socket;
            try {
                dis = new DataInputStream(socket.getInputStream());
                dos = new DataOutputStream(socket.getOutputStream());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run(){
            String name = "";
            try {
                name = dis.readUTF();
                if(clients.get(name)!=null){
                    dos.writeUTF("이미 있는 이름 : " + name);
                    dos.writeUTF("다른 이름으로 다시 연결");
                    System.out.println(socket.getInetAddress() + " : "+
                            socket.getPort() + " disconnect!");
                    dis.close();
                    dos.close();
                    socket.close();
                    socket=null;
                } else {
                    sendAll(name + "이 들어왔음");
                    clients.put(name, dos);
                    while (dis != null) {
                        sendAll(dis.readUTF());
                    }
                }
            } catch (Exception e){
            } finally {
                if(socket!=null){
                    try {
                        sendAll(name + "exit!!!");
                    } catch (IOException e) {}
                    clients.remove(name);
                    System.out.println(socket.getInetAddress()+
                            " " + socket.getPort() + "byebye");
                }
            }
        }
    }
}
