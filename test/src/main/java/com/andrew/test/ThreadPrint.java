package com.andrew.test;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/6/27 21:19
 * @since 1.0
 */
public class ThreadPrint {

    int num = 0;
    boolean flag = false;

    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            ThreadPrint threadPrint1 = new ThreadPrint();
            threadPrint1.mainTest();
        }

    }

    private void startThread1() {
        Thread thread1 = new Thread(() -> {
            write();
        });
        Thread thread2 = new Thread(() -> {
            read();
        });

        thread1.start();
        thread2.start();
    }

    private void read() {
        if (flag) {
            System.out.println("num=" + num);
        } else {
            System.out.println("无法获取");
        }
    }

    public void write() {
        num = 100;
        flag = true;
    }


    public void mainTest() {

        Thread t1 = new Thread(() -> {
            for (; num < 100; ) {
                if (!flag && (num == 0 || ++num % 2 == 0)) {
                    System.out.println(Thread.currentThread().getName() + "偶数:num=" + num);
                    flag = true;
                }
            }
        }
        );

        Thread t2 = new Thread(() -> {
            for (; num < 100; ) {
                if (flag && (++num % 2 != 0)) {
                    System.out.println(Thread.currentThread().getName() + "奇数:num=" + num);
                    flag = false;
                }
            }
        }
        );


        t1.start();
        t2.start();
    }
}
