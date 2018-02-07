package javafortesters.arraysIteration09;

import org.junit.Test;

public class MultiDimensionalArraysTest {

    @Test
    public void createAMultiDimensionalArray() {

        int[][] multi = new int[4][4];

        print2DIntArray(multi);


    }

    public void print2DIntArray(int[][] multi) {

        int count = 0;

        for (int[] outer : multi) {
            if (outer == null) {
                System.out.print("null");
            } else {
                for (int inner : outer) {
                    if (count == outer.length - 1) {
                        System.out.print(inner + ",");
                    } else {
                        System.out.print(inner);
                    }
                }
                System.out.println("");
            }
            count++;
        }
    }
}
