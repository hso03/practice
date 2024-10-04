package com.nhnacademy.linked_data_structures;

import java.util.Arrays;

public class Lab2_2 {

    // TODO#1. System.arraycopy와 동일한 기능을 하는 arraycopy 메서드 구현
    public static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int count) {
        // 복사할 요소의 개수만큼 루프를 돌며 데이터를 복사
        if (src == dest && srcPos < destPos && srcPos + count > destPos) {
            // 원본과 대상 배열이 동일하고, 복사 범위가 겹치는 경우, 뒤에서부터 복사해야 함 (오버랩 방지)
            for(int i=count-1;i>=0;i--){
                dest[destPos+i]=src[srcPos+i];
            }
        } else {
            // 일반적인 경우, 앞에서부터 복사
            for(int i=0;i<count;i++){
                dest[destPos++]=src[srcPos++];
            }
        }
    }

    // 확인을 위한 main 메서드
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] b = a.clone(); // 배열 a를 복제하여 배열 b 생성

        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));

        // arraycopy와 System.arraycopy 테스트 1
        arraycopy(a, 1, a, 3, 5); // a의 1번 인덱스부터 5개의 요소를 3번 인덱스부터 복사
        System.arraycopy(b, 1, b, 3, 5); // 동일한 작업을 b 배열에 System.arraycopy로 수행
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));

        // arraycopy와 System.arraycopy 테스트 2
        arraycopy(a, 4, a, 1, 5); // a의 4번 인덱스부터 5개의 요소를 1번 인덱스부터 복사
        System.arraycopy(b, 4, b, 1, 5); // 동일한 작업을 b 배열에 System.arraycopy로 수행
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));
    }
}
