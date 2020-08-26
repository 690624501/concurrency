package com.concurrency.example.singleton;

import com.concurrency.annoations.ThreadSafe;

/**
 * @program: concurrency
 * @Date: 2020/8/28 15:33
 * @Author: xumc@citycloud.com.cn
 * @Description: 双重校验的懒汉模式
 */
@ThreadSafe
public class SingletonExample {

    private SingletonExample() {

    }

    private volatile static SingletonExample instance = null;

    // 1.memory = allocate() 分配对象的内存空间
    // 2.ctorInstance() 初始化对象
    // 2.instance = memory 设置Instance指向分配的内存空间

    //由于jvm和cpu优化，会出现指令重排

    public static SingletonExample getInstance() {

        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }

            }
        }

        return instance;
    }

}
