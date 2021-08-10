package com.andrew.test.queue;

import java.time.LocalDateTime;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

public class DelayQueueTest {

    public static void main(String[] args) {
        Order order1 = new Order(5, "order1", TimeUnit.SECONDS);
        Order order2 = new Order(15, "order2", TimeUnit.SECONDS);
        Order order3 = new Order(30, "order3", TimeUnit.SECONDS);
        DelayQueue<Order> delayQueue = new DelayQueue<>();
        delayQueue.put(order1);
        delayQueue.put(order2);
        delayQueue.put(order3);
        System.out.println(LocalDateTime.now().toString());
        while (delayQueue.size() > 0) {
            Order order = delayQueue.poll();
            if (order != null) {
                LocalDateTime now = LocalDateTime.now();
                System.out.println("消费order" + order.toString() + ", 时间:" + now.toString());
            }
        }
    }
}
