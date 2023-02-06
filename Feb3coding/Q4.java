package com.coding.Java27coding.Feb3coding;

public class Q4 {
    public int[][] matrixAddition(int[][] m1, int[][] m2){
        int i, j;
        int C[][] = new int[m1.length][m1[0].length];

        for (i = 0; i < m1.length; i++)
            for (j = 0; j < m1[0].length; j++)
                C[i][j] = m1[i][j] + m2[i][j];

        return C;
    }
}
