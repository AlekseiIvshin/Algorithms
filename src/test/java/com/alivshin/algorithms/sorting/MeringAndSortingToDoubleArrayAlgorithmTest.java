package com.alivshin.algorithms.sorting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Aleksei_Ivshin on 3/21/17.
 */

@RunWith(JUnit4.class)
public class MeringAndSortingToDoubleArrayAlgorithmTest {

    MeringAndSortingToDoubleArrayAlgorithm algorithm;

    @Before
    public void setUp() {
        algorithm = new MeringAndSortingToDoubleArrayAlgorithm();
    }

    @Test
    public void shouldMergeAndSortingPseudoRandomArray() {
        // Given
        int[] a = {0, 5, 6, 18};
        int[] b = {1, 3, 13, 80, -1, -1, -1, -1};

        // When
        algorithm.sort(a, b);

        // Then
        assertArrayEquals(Arrays.toString(b), new int[]{0, 1, 3, 5, 6, 13, 18, 80}, b);
    }

    @Test
    public void shouldMergeAndSortingArrayWhereDestinationArrayContainsGreaterElements() {
        // Given
        int[] a = {0, 5, 6, 18};
        int[] b = {19, 39, 53, 80, -1, -1, -1, -1};

        // When
        algorithm.sort(a, b);

        // Then
        assertArrayEquals(Arrays.toString(b), new int[]{0, 5, 6, 18, 19, 39, 53, 80}, b);
    }

    @Test
    public void shouldMergeAndSortingArrayWhereSourceArrayContainsGreaterElements() {
        // Given
        int[] a = {19, 39, 53, 80};
        int[] b = {0, 5, 6, 18, -1, -1, -1, -1};

        // When
        algorithm.sort(a, b);

        // Then
        assertArrayEquals(Arrays.toString(b), new int[]{0, 5, 6, 18, 19, 39, 53, 80}, b);
    }

    @Test
    public void shouldMergeAndSortingPseudoRandomArrayInCaseSomeItemsAreEqual() {
        // Given
        int[] a = {0, 5, 6, 18};
        int[] b = {1, 5, 13, 80, -1, -1, -1, -1};

        // When
        algorithm.sort(a, b);

        // Then
        assertArrayEquals(Arrays.toString(b), new int[]{0, 1, 5, 5, 6, 13, 18, 80}, b);
    }
}