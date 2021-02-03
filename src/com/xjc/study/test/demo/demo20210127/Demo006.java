package com.xjc.study.test.demo.demo20210127;

import java.util.Scanner;

/**
 * Description: TODO
 *题目描述
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：
 * 先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，
 * 喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 * 输入描述:
 * 输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行。
 * 输出描述:
 * 对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
 * 示例1 输入 3 10 81  0
 *      输出 1 5 40
 * @title: Demo006
 * Created by 19040838 on 2021.01.27 17:03
 */
public class Demo006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNext("0")){
            int n = sc.nextInt();
            int count = 0;
            while(n / 3 > 0){
                count += n / 3;
                n = n / 3 + n % 3;
                if(n == 2){
                    n = n + 1;
                }
            }
            System.out.println(count);
        }
    }
}
