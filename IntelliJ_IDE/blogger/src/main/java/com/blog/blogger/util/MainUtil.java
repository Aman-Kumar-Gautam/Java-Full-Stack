package com.blog.blogger.util;

import java.util.function.Predicate;

public class MainUtil {
    public static void main(String[] args) {
        Predicate<Integer>condition = y->y>0;
        boolean val = condition.test(100);
        System.out.print(val);
    }

}
