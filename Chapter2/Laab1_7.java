package com.nhnacademy.arrays;

import java.util.Arrays;

public class Laab1_7 {
    public static void main(String[] args) {
        // TODO#1. 정수 배열 a를 생성하고 출력
        int[] a = {22,44,66,88};
        System.out.println("a : " + Arrays.toString(a));

        // TODO#2. a.clone()을 이용해 복제된 배열 b를 생성하고 출력
        int[] b = a.clone();
        System.out.println("b (복제된 배열) : " + Arrays.toString(b));

        // // TODO#3. 문자 배열 c를 생성하고 출력
        String[] c = {"AB", "CD", "EF"};
        System.out.println("c : " + Arrays.toString(c));

        // // TODO#4. c.clone()을 이용해 복제된 배열 d를 생성하고 출력
        String[] d = c.clone();
        System.out.println("d (복제된 배열) : " + Arrays.toString(d));

        // // TODO#5. 배열 c의 두번째 요소를 변경하고, 배열 c와 d를 출력
        c[1] = "XYZ";
        System.out.println("c (변경 후) : " + Arrays.toString(c));
        System.out.println("d (복제된 배열, 변경 없음) : " + Arrays.toString(d));

        // // TODO#6. 주어진 값들을 이용해 StringBuilder 배열 e를 생성하고 출력
        StringBuilder[] e = new StringBuilder[d.length];
        for(int i=0;i<d.length;i++){
            e[i]=new StringBuilder(d[i]);
        }
        System.out.println("e : " + Arrays.toString(e));

        // // TODO#7. e.clone()을 이용해 복제된 배열 f를 생성하고 출력
        StringBuilder[] f = e.clone();
        System.out.println("f (복제된 배열) : " + Arrays.toString(f));

        // // TODO#8. 배열 e의 두번째 요소를 변경하고, 배열 e와 f를 출력
        e[1].append("CD");
        System.out.println("e (변경 후) : " + Arrays.toString(e));
        System.out.println("f (복제된 배열, 객체 참조 변경됨) : " + Arrays.toString(f));
    }
}
