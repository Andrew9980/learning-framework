package com.andrew.test.bio.fileupload;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/6/30 22:51
 * @since 1.0
 */
public class ServerHandler extends Thread {

    private Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream dos = new DataInputStream(socket.getInputStream());
            String suffix = dos.readUTF();
            System.out.println("服务端接受到文件，后缀为：" + suffix);
            OutputStream os = new FileOutputStream("C:\\Users\\Andrew\\Pictures\\Saved Pictures\\" +
                    UUID.randomUUID().toString() + suffix);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = dos.read(buffer)) > 0) {
                os.write(buffer, 0, len);
            }
            os.close();
            System.out.println("文件保存成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
