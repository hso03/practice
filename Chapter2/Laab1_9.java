package com.nhnacademy.arrays;

import java.util.Arrays;

public class Laab1_9 {
    public static void main(String[] args) {
        // TODO#1. 정수 5개를 갖는 배열 a 생성
        int[] a = {1,2,3,4,5};

        // TODO#2. Arrays.copyOfRange()를 이용해 3번째 요소부터 5번째 요소를 복제하여 배열 b 생성
        int[] b = Arrays.copyOfRange(a, 2, 5);
        /* ... */ // 인덱스 2 (3번째 요소)부터 5 (exclusive)까지

        // TODO#3. Arrays.copyOfRange()를 이용해 3번째 요소부터 10번째 요소를 복제하여 배열 c 생성
        int[] c = Arrays.copyOfRange(a, 2, 10);
        /* ... */ // 인덱스 2 (3번째 요소)부터 10 (배열의 크기를 초과할 경우 0으로 채워짐)

        // TODO#4. 모든 배열을 출력
        System.out.println("배열 a: " + Arrays.toString(a));
        System.out.println("배열 b (3번째~5번째 요소): " + Arrays.toString(b));
        System.out.println("배열 c (3번째~10번째 요소): " + Arrays.toString(c));
    }
}
