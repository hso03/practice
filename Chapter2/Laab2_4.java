package com.nhnacademy.linked_data_structures;

import java.util.Arrays;
import java.util.Random;

public class Laab2_4 {
    /**
     * TODO#1. 새로운 요소를 요소 배열에 추가하고, 인덱스 배열을 업데이트하여 정렬된 순서를 유지하는 메서드.
     *
     * @param a    요소 배열.
     * @param k    인덱스 배열. k[i]는 요소 i 다음에 올 인덱스를 가리킴.
     * @param free 현재 삽입할 위치.
     * @param x    삽입할 요소.
     */ 
    public static void insert(int[] a, int[] k, int free, int x) {
        // TODO#1-1. a[free] 위치에 새로운 요소 추가
        a[free]=x;
        // 인덱스 배열에서 삽입할 위치를 찾는다
        int prev = 0; // k[0]은 리스트의 첫 번째 요소를 가리킨다
        int current = k[0];

        
        // TODO#1-2. 요소를 삽입할 위치를 찾는다 (정렬된 순서 유지)
        while (current != 0 && a[current] < x) {
            prev = current;
            current = k[prev];
        }

        k[free]=current;
        k[prev]=free;


        // System.out.println("Current : " + current);
        // System.out.println("prev : " + prev);
        // System.out.println("free : " + free);
        System.out.println("");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(k));


        // System.out.println("");
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(k));

        // TODO#1-3. 새로운 요소의 인덱스(free)를 인덱스 배열에 삽입
        // ...
    }

    /**
     * TODO#2. 요소 배열과 인덱스 배열을 이용해 정렬된 배열을 문자열로 출력하는 메서드.
     *
     * @param a 요소 배열.
     * @param k 인덱스 배열.
     * @return 정렬된 배열을 문자열로 반환.
     */
    public static String toString(int[] a, int[] k) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        // 첫 번째 요소를 가리키는 인덱스
        int current = k[0];
        // TODO#2-1. 첫번째 요소 출력
        if (current != 0) {
            builder.append(a[0]+" ");
        }

        // TODO#2-2. 나머지 요소 출력
        while (current != 0) {
            builder.append(a[current]+" ");
            current=k[current];
        }

        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        int[] a = new int[10]; // 요소 배열
        int[] k = new int[10]; // 인덱스 배열 (리스트)
        Random random = new Random();

        // 초기화: k 배열의 모든 값을 0으로 설정 (다음 요소가 없음을 의미)
        for (int i = 0; i < 10; i++) {
            k[i] = 0;
        }

        int free = 1; // 삽입할 위치를 나타내는 변수

        // 9번의 삽입을 실행
        for (int i = 0; i < 6; i++) {
            // System.out.println(i + " : 번째");
            int x = random.nextInt(100); // 0~99 사이의 무작위 숫자 생성
            // System.out.print(toString(a, k) + " + " + x);
            insert(a, k, free, x); // 요소를 배열에 삽입
            free++; // 다음 삽입 위치로 증가
            // System.out.println(" = " + toString(a, k));
        }
    }
}
