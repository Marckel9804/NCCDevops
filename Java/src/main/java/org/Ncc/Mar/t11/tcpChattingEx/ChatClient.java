package org.Ncc.Mar.t11.tcpChattingEx;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 9999);
            Scanner sc = new Scanner(System.in);
            System.out.print("이름 : ");
            String name = sc.nextLine();

            Thread sender = new Thread(new Sender(socket,name));
            Thread receiver = new Thread(new Receiver(socket));

            sender.start();
            receiver.start();

        } catch (Exception e ) {}
    }
    static class Sender extends Thread{
        Socket socket;
        String name;
        DataOutputStream dos;
        Sender(Socket socket, String name){
           this.socket = socket;
           this.name = name;
           try {
               dos = new DataOutputStream(socket.getOutputStream());
           } catch (Exception e ) {}

       }

        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            try {
                if(dos != null) {
                    dos.writeUTF(name);
                }
                while (dos != null) {
                    String message = sc.nextLine();
                    if(message.equals("stop")){
                        break;
                    }
                    dos.writeUTF("("+name+")"+ message);
                }
                dos.close();
                socket.close();
            } catch (Exception e) {}
        }
    }
    static class Receiver extends Thread{
        Socket socket;
        DataInputStream dis;

        Receiver(Socket socket){
            this.socket = socket;
            try {
                dis = new DataInputStream(socket.getInputStream());
            } catch (Exception e) {}

        }
        @Override
        public void run() {
            while (dis != null) {
                try {
                    System.out.println(dis.readUTF());

                } catch (Exception e ) {
                    break;
                }
            }
            try {
                dis.close();
                socket.close();
            } catch (Exception e) {}
        }
    }
}
