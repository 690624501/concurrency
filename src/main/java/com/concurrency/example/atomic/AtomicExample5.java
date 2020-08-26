package com.concurrency.example.atomic;

import com.concurrency.annoations.ThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @program: concurrency
 * @Date: 2020/8/26 20:55
 * @Author: xumc@citycloud.com.cn
 * @Description:
 */
@Slf4j
@ThreadSafe
public class AtomicExample5 {

   private static AtomicIntegerFieldUpdater<AtomicExample5> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class, "count");

   @Getter
   public volatile int count = 100;

   private static AtomicExample5 example5 = new AtomicExample5();

   public static void main(String[] args) {
        if(updater.compareAndSet(example5, 100, 120)){
            log.info("uqdate success,{}", example5.getCount());
        }

       if(updater.compareAndSet(example5, 100, 120)){
           log.info("uqdate success,{}", example5.getCount());
       }else {
           log.info("uqdate failed,{}", example5.getCount());
       }
   }
}
