package com.nhnacademy.linked_data_structures;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Lab2_2Test {
    
    public void testArrayCopy() {
        // 1. 배열 a와 b 생성
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] b = a.clone(); // a를 복제한 b 배열

        // 2. 초기 상태 테스트
        assertArrayEquals(a, b, "초기 배열은 동일해야 한다.");

        // 3. Custom arraycopy와 System.arraycopy 비교
        Lab2_2.arraycopy(a, 1, a, 3, 5); // a의 1번 인덱스부터 5개를 3번 인덱스에 복사
        System.arraycopy(b, 1, b, 3, 5); // 동일 작업을 System.arraycopy로 수행
        assertArrayEquals(a, b, "첫 번째 arraycopy 후 두 배열은 동일해야 한다.");

        // 4. 추가 테스트: 겹치는 복사
        Lab2_2.arraycopy(a, 4, a, 1, 5); // a의 4번 인덱스부터 5개를 1번 인덱스에 복사
        System.arraycopy(b, 4, b, 1, 5); // 동일 작업을 System.arraycopy로 수행
        assertArrayEquals(a, b, "두 번째 arraycopy 후 두 배열은 동일해야 한다.");
    }
}
