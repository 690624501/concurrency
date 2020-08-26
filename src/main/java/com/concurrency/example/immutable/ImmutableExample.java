package com.concurrency.example.immutable;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Map;

/**
 * @program: concurrency
 * @Date: 2020/8/28 16:11
 * @Author: xumc@citycloud.com.cn
 * @Description:
 */
@Slf4j
public class ImmutableExample {

    private final static Integer a =1;

    private final static String b = "2";

    private static Map<Integer,Integer> map = Maps.newHashMap();
    static {
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map = Collections.unmodifiableMap(map);
    }

    public static void main(String[] args) {
        map.put(1, 3);
        log.info("{}", map.get(1));
    }
}
