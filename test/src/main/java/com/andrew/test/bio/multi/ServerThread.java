package com.andrew.test.bio.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread {

    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String msg = null;
            while ((msg = reader.readLine()) != null) {
                System.out.println("接收：" + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
