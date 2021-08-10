package com.andrew.test.queue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Order implements Delayed {

    private long time;
    private String name;

    public Order(long time, String name, TimeUnit unit) {
        this.time = System.currentTimeMillis() + unit.toMillis(time);
        this.name = name;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return time - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        if (o instanceof Order) {
            if (time > ((Order) o).time) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Order{" +
                "time=" + time +
                ", name='" + name + '\'' +
                '}';
    }
}
