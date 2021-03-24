package com.xjc.study.test;

import com.xjc.study.toolutils.ArrayUtils;
import com.xjc.study.toolutils.ConvertUtils;
import com.xjc.study.toolutils.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description: TODO
 *
 * @title: Demo
 * Created by 19040838 on 2021.02.20 9:41
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            if (arr[head] + arr[tail] == 6) {
                list.add(arr[head]);
                list.add(arr[tail]);
                head++;
                tail--;
            } else if (arr[head] + arr[tail] > 6){
                tail--;
            } else {
                head++;
            }
        }
        System.out.println(list);
    }
}