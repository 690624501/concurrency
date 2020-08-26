package com.concurrency.example.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: concurrency
 * @Date: 2020/8/28 16:11
 * @Author: xumc@citycloud.com.cn
 * @Description:
 */
@Slf4j
public class ImmutableExample2 {

    private final static ImmutableList LIST = ImmutableList.of(1, 2, 3);

    private final static ImmutableSet SET = ImmutableSet.copyOf(LIST);

    public static void main(String[] args) {
       LIST.add(3);
    }
}
