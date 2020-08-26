package com.concurrency.example.publish;

import com.concurrency.annoations.NotRecommend;
import com.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: concurrency
 * @Date: 2020/8/26 22:29
 * @Author: xumc@citycloud.com.cn
 * @Description:
 */
@Slf4j
@NotRecommend
@NotThreadSafe
public class Escape {

    private Integer thisCanBeEscape = 0 ;

    public Escape(){
        new InnerClass();
    }

    public class InnerClass{
        public InnerClass(){
            log.info("{}",Escape.this.thisCanBeEscape );
        }
    }
    
    public static void main(String[] args) {
          new Escape();
    }
}
