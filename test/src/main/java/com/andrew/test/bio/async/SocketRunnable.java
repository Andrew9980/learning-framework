package com.andrew.test.bio.async;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/6/29 22:50
 * @since 1.0
 */
public class SocketRunnable implements Runnable {

    private Socket socket;

    public SocketRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
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
