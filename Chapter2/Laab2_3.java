package com.nhnacademy.linked_data_structures;

import java.util.Arrays;

/**
 * 요소 배열과 인덱스 배열을 사용하여 정렬된 데이터를 관리하는 클래스로,
 * 요소 배열에 값을 삽입하고, 정렬된 순서로 출력하는 기능을 제공합니다.
 */
public class Lab2_3 {

    /**
     * TODO#1. 새로운 요소를 요소 배열에 삽입하고, 인덱스 배열을 사용하여 정렬된 순서를 유지하는 메서드.
     *
     * @param a      요소들이 저장된 배열.
     * @param k      정렬된 배열을 만들기 위해 요소의 인덱스를 순서대로 가지고 있는 인덱스 배열.
     * @param length 배열에 현재 저장된 요소의 개수.
     * @param x      새롭게 삽입될 요소.
     */
    public static void insert(int[] a, int[] k, int length, int x) {
        // TODO#1-1. 새 데이터를 요소 배열 'a'에 삽입
        a[length]=x;
        k[length]=length;

        // 인덱스 배열 'k'에서 x가 들어갈 위치를 찾음
        int i = length - 1;
        while (i >= 0 && a[k[i]] > x) {
            // TODO#1-2. 인덱스 배열을 한 칸씩 뒤로 밀어서 공간 확보
            k[i+1]=k[i];
            i--;
        }
        k[i+1]=length;
        // TODO#1-3. 새로운 요소의 인덱스를 인덱스 배열에 설정

        System.out.println("");
    }

    /**
     * TODO#2. 인덱스 배열을 참조하여 요소 배열을 정렬된 순서로 출력하는 메서드.
     *
     * @param a      요소들이 저장된 배열.
     * @param k      정렬된 배열을 만들기 위해 요소의 인덱스를 순서대로 가지고 있는 인덱스 배열.
     * @param length 배열에 현재 저장된 요소의 개수.
     * @return 정렬된 순서대로 배열의 요소를 문자열로 반환.
     */
    public static String toString(int[] a, int[] k, int length) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        if (length > 0) {
            // TODO#2-1. 첫 번째 요소 추가
            builder.append(a[k[0]]+" ");
        }

        // TODO#2-2. 나머지 요소 추가
        for (int i = 1; i < length; i++) {
            builder.append(a[k[i]]+" ");
        }

        builder.append("]");
        return builder.toString();
    }

    /**
     * 인덱스 배열을 사용하여 요소를 삽입하고 정렬된 배열을 출력하는 메서드를 테스트하는 메인 메서드.
     *
     * @param args 명령줄 인자 (사용되지 않음).
     */
    public static void main(String[] args) {
        // 요소 배열 'a'와 인덱스 배열 'k'
        int[] a = new int[10]; // 최대 10개의 요소를 저장할 수 있는 배열
        int[] k = new int[10]; // 정렬된 순서를 유지하기 위한 인덱스 배열
        int length = 0; // 현재 배열에 저장된 요소의 개수

        // 첫 번째 데이터 삽입
        insert(a, k, length++, 30);
        System.out.println("1번 : 30 / 삽입 후 배열: " + toString(a, k, length));

        // 두 번째 데이터 삽입
        insert(a, k, length++, 10);
        System.out.println("2번 : 10 / 삽입 후 배열: " + toString(a, k, length));

        // 세 번째 데이터 삽입
        insert(a, k, length++, 20);
        System.out.println("3번 : 20 / 삽입 후 배열: " + toString(a, k, length));

        // 네 번째 데이터 삽입
        insert(a, k, length++, 40);
        System.out.println("4번 : 40 / 삽입 후 배열: " + toString(a, k, length));

        // 다섯 번째 데이터 삽입
        insert(a, k, length++, 25);
        System.out.println("5번 : 25 / 삽입 후 배열: " + toString(a, k, length));
    }
}
