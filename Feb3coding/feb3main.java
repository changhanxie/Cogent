package com.coding.Java27coding.Feb3coding;

public class feb3main {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.findAllSubstring("awaglk", 4);
        q1.findAllSubstring("haaag", 3);
        q1.findAllSubstring("democracy", 5);


        Q4 q4 = new Q4();
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        int B[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        int C[][] = q4.matrixAddition(A, B);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++)
                System.out.print(C[i][j] + " ");

            System.out.println();
        }
    }
}
