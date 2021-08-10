package com.andrew.test.bio.fileupload;

import java.io.*;
import java.net.Socket;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/6/29 23:41
 * @since 1.0
 */
public class Client {

    public static void main(String[] args) {
        try(
                InputStream ins = new FileInputStream("C:\\Users\\Andrew\\Pictures\\Saved Pictures\\pic.jpg");
            ) {
            Socket socket = new Socket("127.0.0.1", 9999);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(".jpg");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = ins.read(buffer)) > 0) {
                dos.write(buffer, 0, len);
            }
            dos.flush();
            socket.shutdownOutput();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
