package quiksort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Wangpl
 * Time 2018/8/28 13:17
 */
public class QuikSort {

    private static final int INT_SIZE = 10;

    public static void main(String[] args) {
        int[] arrays = new int[INT_SIZE];
        Random random = new Random();
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(arrays));
        quiksort(arrays, 0, arrays.length - 1);
        System.out.println(Arrays.toString(arrays));
    }

    public static void quiksort(int[] a, int p, int q) {

        if (p > q)
            return;

        int i = p;
        int j = q;
        int temp = a[p];

        while (i < j) {
            while (a[j] >= temp && i < j)
                j--;
            while (a[i] <= temp && i < j)
                i++;

            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[p] = a[i];
        a[i] = temp;

        quiksort(a, p, i - 1);
        quiksort(a, i + 1, q);
    }


}

