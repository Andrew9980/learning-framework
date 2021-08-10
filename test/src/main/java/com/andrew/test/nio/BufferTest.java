package com.andrew.test.nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/8/1 15:21
 * @since 1.0
 */
public class BufferTest {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(100);
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        System.out.println("-------------------------");
        buffer.put("xusiqing".getBytes());
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

        buffer.flip();
        System.out.println("-------------------------");
        System.out.println((char) buffer.get());
        System.out.println(buffer.get("xusiqi".getBytes()));
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

        System.out.println(buffer.isDirect());


    }

}
