package com.tongji.caffeine;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
public class CaffeineTest {
    @Test
    public void test1() {
        Cache<Integer, String> student = Caffeine.newBuilder().build();
        System.out.println(student.getIfPresent(1));
        System.out.println(student.get(1, k -> "123"));
        System.out.println(student.getIfPresent(1));
    }
}
