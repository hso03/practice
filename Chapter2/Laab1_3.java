package com.nhnacademy.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab1_3 {
    public static void main(String[] args) {
        // 2차원 배열 d를 생성하여 구구단을 저장
        int[][] d = new int[9][9];

        // TODO#1. 구구단 계산하여 배열 d에 저장
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j]=(i+1)*(j+1);
            }
        }

        // TODO#2. 배열 d의 각 요소를 개별적으로 출력
        System.out.println("개별 요소 출력:");
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d.length;j++){
                System.out.println((i+1) + " * " + (j+1) + " = " + d[i][j]);
            }
        }

        // 3. 배열을 Arrays.toString()을 이용하여 출력
        System.out.println("\nArrays.toString() 출력:");
        for(int i=0;i<9;i++){
            System.out.println(Arrays.toString(d[i]));
        }

        // 4. 배열을 Arrays.deepToString()을 이용하여 출력
        System.out.println("\nArrays.deepToString() 출력:");
        System.out.println(Arrays.deepToString(d));
    }
}
