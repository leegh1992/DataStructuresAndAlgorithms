package com.leegh.array;

/**
 * 求素数，素数筛选法
 * Created by lee on 2016/8/23.
 */
public class Sushu {

    int solve1(int[] array, int n) {
        int opt_Num = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    array[i] = 0;
                    opt_Num++;
                }
            }
        }
        return opt_Num;
    }

    int solve2(int[] array, int n) {
        int opt_Num = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j * j < i; j++) {
                if (i % j == 0) {
                    array[i] = 0;
                    opt_Num++;
                }
            }
        }
        return opt_Num;
    }

    int solve3(int[] array, int n) {
        int opt_Num = 0;
        for (int i = 2; i <= n; i++) {
            if (array[i] == 0) {
                for (int j = 2; j <= i; j++) {
                    array[i * j] = 1;
                    opt_Num++;
                }
            }
        }
        return opt_Num;
    }

    /**
     * 性能最好，时间复杂度为o(n)
     *
     * @param array
     * @param n
     * @return
     */
    int solve4(int[] array, int n) {
        int opt_Num = 0;
        int[] primeList = new int[n + 5];
        return opt_Num;
    }

    public static void main(String[] args) {

    }
}
