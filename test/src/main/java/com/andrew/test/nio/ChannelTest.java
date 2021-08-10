package com.andrew.test.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/8/1 15:55
 * @since 1.0
 */
public class ChannelTest {

    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            System.out.println("初始：");
            System.out.println(buffer.position());
            System.out.println(buffer.limit());
            System.out.println(buffer.capacity());
            buffer.put("许思情".getBytes());
            FileOutputStream out = new FileOutputStream("test/test1.txt");
            buffer.flip();
            System.out.println("转读");
            System.out.println(buffer.position());
            System.out.println(buffer.limit());
            System.out.println(buffer.capacity());
            out.getChannel().write(buffer);
            System.out.println("写入文件完成：");
            System.out.println(buffer.position());
            System.out.println(buffer.limit());
            System.out.println(buffer.capacity());
            out.close();
            buffer.clear();
            System.out.println("清空：");
            System.out.println(buffer.position());
            System.out.println(buffer.limit());
            System.out.println(buffer.capacity());
            FileInputStream in = new FileInputStream("test/test1.txt");
            in.getChannel().read(buffer);
            System.out.println("读取文件完成");
            System.out.println(buffer.position());
            System.out.println(buffer.limit());
            System.out.println(buffer.capacity());
            in.close();
            buffer.flip();
            System.out.println("转读：");
            System.out.println(new String(buffer.array(), 0, buffer.remaining()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
