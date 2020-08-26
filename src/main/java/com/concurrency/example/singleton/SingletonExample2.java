package com.concurrency.example.singleton;

import com.concurrency.annoations.ThreadSafe;

/**
 * @program: concurrency
 * @Date: 2020/8/28 15:33
 * @Author: xumc@citycloud.com.cn
 * @Description: 饿汉模式
 */
@ThreadSafe
public class SingletonExample2 {

    private SingletonExample2() {

    }

    private volatile static SingletonExample2 instance = new SingletonExample2();


    public static SingletonExample2 getInstance() {

        return instance;
    }

}
