package com.leegh.array;

/**
 * 求素数，素数筛选法
 * Created by lee on 2016/8/23.
 */
public class Sushu {

    public static int solve1(int[] array, int n) {
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

    public static int solve2(int[] array, int n) {
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

    public static int solve3(int[] array, int n) {
        int opt_Num = 0;
        for (int i = 2; i <= n; i++) {
            if (array[i] == 0) {
                for (int j = 2; i * j <= n; j++) {
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
    public static int solve4(int[] array, int n) {
        int opt_Num = 0;
        int[] primeList = new int[n + 5];
        for (int i = 2; i <= n; i++) {
            if (array[i] == 0) {
                primeList[++primeList[0]] = i;
            }
            for (int j = 0; j <= primeList[0] && i * primeList[j] <= n; j++) {
                array[(i * primeList[j])] = 1;
                opt_Num++;
                if (i % primeList[j] == 0) {
                    break;
                }
            }
        }
        return opt_Num;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[105];
        System.out.println(Sushu.solve1(arr1, 100));
        System.out.println(Sushu.solve2(arr1, 100));
        System.out.println(Sushu.solve3(arr1, 100));
        System.out.println(Sushu.solve4(arr1, 100));
    }
}
