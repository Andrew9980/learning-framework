package com.andrew.test.bio.fileupload;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/6/30 22:49
 * @since 1.0
 */
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                Socket socket = serverSocket.accept();
                new ServerHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
