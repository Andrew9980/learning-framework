package com.andrew.test.bio.async;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author siqing.xu
 * @version 1.0
 * @desc
 * @date 2021/6/29 22:46
 * @since 1.0
 */
public class ServerExecutorHandler {

    private ExecutorService executorService;

    public ServerExecutorHandler(int coreSize, int queueSize) {
        this.executorService = new ThreadPoolExecutor(coreSize, 20, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(queueSize));
    }

    public void execute(Runnable runnable) {
        executorService.execute(runnable);
    }
}
