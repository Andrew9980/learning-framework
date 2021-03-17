package com.andrew.study.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Collections;

/**
 * @author oreoft
 */
@Data
@Builder
@AllArgsConstructor
@ToString
public class ResponseEntity<T> {

    private int code;
    private String message;
    private T data;


    /**
     * 用构造器只传入code和message, 则data为空,常用于判空返回
     *
     * @param code
     * @param message
     */
    public ResponseEntity(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = (T) Collections.EMPTY_LIST;
    }

    /**
     * 用空构造器默认200和成功,data为空
     */
    public ResponseEntity() {
        this.code = 200;
        this.message = "success";
        this.data = (T) Collections.EMPTY_LIST;
    }

    /**
     * 用构造器默认200和成功, data传入
     *
     * @param data
     */
    public ResponseEntity(T data) {
        this.code = 200;
        this.message = "success";
        this.data = data;
    }


}
