package com.alivshin.algorithms.sorting;

import java.util.Locale;

/**
 * Created by Aleksei_Ivshin on 3/21/17.
 * <p>
 * Даны два отсортированных по возрастанию массива с одинаковым количеством реальных значений.
 * Второй массив вдвое длиньше первого, чтобы была возможность использовать его как контейнер для обоих массивов.
 * Дополнительные элементы массива имеют значение -1 для наглядности.
 * <p>
 * Задача: поместить элементы из обоих массивов во второй по возрастанию.
 * В результате массив b должен стать [0, 1, 3, 5, 6, 13, 18, 80]
 */

public class MeringAndSortingToDoubleArrayAlgorithm {

    public void sort(int[] a, int[] b) {
        int aIndex = a.length - 1;
        int bIndex = aIndex;
        int resultIndex;
        for (resultIndex = b.length - 1; resultIndex >= 0; resultIndex--) {
            if (aIndex >= 0 && (bIndex < 0 || a[aIndex] >= b[bIndex])) {
                b[resultIndex] = a[aIndex];
                aIndex--;
                continue;
            }
            if (bIndex >= 0 && (aIndex < 0 || a[aIndex] < b[bIndex])) {
                int tmp = b[resultIndex];
                b[resultIndex] = b[bIndex];
                b[bIndex] = tmp;
                bIndex--;
            }
        }
    }

    public void sort1(int[] a, int[] b) {

        int lastA = a.length - 1;
        int lastB = lastA;
        int total = b.length - 1;

        while (lastA >= 0 && lastB >= 0) {
            if (a[lastA] > b[lastB]) {
                b[total] = a[lastA];
                lastA--;
            } else {
                b[total] = b[lastB];
                lastB--;
            }
            total--;
        }

        for (int i = lastA; i >= 0; i--) {
            b[total] = a[i];
            total--;
        }

    }
}
