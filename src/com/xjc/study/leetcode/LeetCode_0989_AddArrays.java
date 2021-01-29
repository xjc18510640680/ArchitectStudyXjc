package com.xjc.study.leetcode;

import com.xjc.study.toolutils.ArrayUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static javafx.scene.input.KeyCode.L;

/**
 * Description: TODO 989. 数组形式的整数加法
 * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 * 提示：
 *     1 <= A.length <= 10000
 *     0 <= A[i] <= 9
 *     0 <= K <= 10000
 *     如果 A.length > 1，那么 A[0] != 0
 * 示例 1： 输入：A = [1,2,0,0], K = 34 输出：[1,2,3,4]  解释：1200 + 34 = 1234
 * 示例 2： 输入：A = [2,7,4], K = 181 输出：[4,5,5] 解释：274 + 181 = 455
 * 示例 3： 输入：A = [2,1,5], K = 806 输出：[1,0,2,1] 解释：215 + 806 = 1021
 * 示例 4： 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1 输出：[1,0,0,0,0,0,0,0,0,0,0] 解释：9999999999 + 1 = 10000000000
 * @title: LeetCode_0989_AddArrays
 * Created by 19040838 on 2021.01.22 10:31
 */
public class LeetCode_0989_AddArrays {

    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> resultList = new ArrayList<>();
        int n = A.length;
        for (int i = n - 1; i >= 0 || K > 0; --i, K /= 10) {
            System.out.println("入i = " + i + " K = " + K);
            if (i >= 0) {
                K += A[i];
            }
            System.out.println("出i = " + i + " K = " + K);
            resultList.add(K % 10);
            System.out.println("resultList = " + resultList);
        }
        Collections.reverse(resultList);
        return resultList;
    }

    public static void main(String[] args) {
        int[] A = {9,9,9,9,9,9,9,9,9,9};
        int K = 1;
        System.out.print("输入：" + " K = " + K + ", A = ");
        ArrayUtils.printArray(A);
        System.out.println("输出：" + addToArrayForm(A, K));
    }

}
