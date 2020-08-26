package com.concurrency.example.singleton;

import com.concurrency.annoations.ThreadSafe;

/**
 * @program: concurrency
 * @Date: 2020/8/28 15:33
 * @Author: xumc@citycloud.com.cn
 * @Description: 枚举模式
 */
@ThreadSafe
public class SingletonExample3 {

    private SingletonExample3() {

    }

    private volatile static SingletonExample3 instance = new SingletonExample3();

    public static SingletonExample3 getInstance() {

        return Singleton.INSTANCE.getInstance();
    }

    public enum Singleton {
        INSTANCE;

        private SingletonExample3 singleton;

        Singleton() {
            singleton = new SingletonExample3();
        }

        public SingletonExample3 getInstance() {
            return singleton;
        }

    }

}
