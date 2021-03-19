package com.andrew.test;

import com.google.common.collect.Lists;
import sun.jvm.hotspot.runtime.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    List<String> list = new ArrayList<>(4);


    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        lock.unlock();

    }

}
