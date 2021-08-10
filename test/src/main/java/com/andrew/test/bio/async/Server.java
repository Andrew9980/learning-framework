package com.andrew.test.bio.async;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/6/29 22:49
 * @since 1.0
 */
public class Server {

    public static void main(String[] args) {
        ServerExecutorHandler handler = new ServerExecutorHandler(4, 10);
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            SocketRunnable runnable = new SocketRunnable(socket);
            handler.execute(runnable);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
