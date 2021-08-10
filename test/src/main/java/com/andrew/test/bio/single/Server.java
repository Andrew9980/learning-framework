package com.andrew.test.bio.single;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Socket socket = null;
                try {
                    socket = serverSocket.accept();
                    InputStream inputStream = socket.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    String msg = reader.readLine();
                    if (msg != null) {
                        System.out.println("服务端接收：" + msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }

}
