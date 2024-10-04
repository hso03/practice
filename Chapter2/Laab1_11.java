package com.nhnacademy;

import java.util.Arrays;

public class Laab1_11 {

    // TODO#1. 순차 검색 알고리즘 구현
    public static int search(int[] array, int key) {
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO#2. 정수 8개를 갖는 배열 a 생성 및 출력
        int[] a = {22,33,44,55,66,77,88,99};
        System.out.println("배열 a: " + Arrays.toString(a));

        // // 3. 44, 50, 77, 100을 검색하고 결과 출력
        System.out.printf("search(a, 44) : %d%n", search(a, 44));
        System.out.printf("search(a, 50) : %d%n",  search(a, 50));
        System.out.printf("search(a, 77) : %d%n",  search(a, 77));
        System.out.printf("search(a, 100) : %d%n", search(a, 100));
    }
}
