package com.nhnacademy.linked_data_structures;

import java.util.Random;

public class Laab2_7 {

    /**
     * TODO#1. 새로운 값을 정렬된 순서에 맞게 리스트에 삽입하는 메서드.
     * 리스트가 비어 있거나, 삽입 값이 리스트의 맨 앞에 와야 하는 경우를 처리.
     *
     * @param start 리스트의 시작 노드.
     * @param value 삽입할 값.
     * @return 새로운 노드가 삽입된 리스트의 시작 노드.
     */
    public static Node insert(Node start, int value) {
        // TODO#1-1. 리스트가 비어 있을 때 (첫 번째 요소 추가)
        if (start == null) {
            start = new Node(value);
            return start;
        }

        // TODO#1-2. 첫 번째 요소보다 작은 값이 들어올 경우
        if (start.value > value) {
            Node startNode = new Node(value);
            startNode.next=start;
            start=startNode;
            return start;
        }

        // TODO#1-3. 적절한 위치를 찾아 삽입
        Node current = start;

        // current는 앞에
        // 뒤에는 ?????
        while (current.next != null && current.next.value<value) {
            current=current.next;
        }

        Node newNode = new Node(value);
        newNode.next=current.next;
        current.next=newNode;


        // TODO#1-4. 새로운 노드를 삽입

        // TODO#1-5.
        return start; // 변경된 시작 노드를 반환
    }

    /**
     * TODO#2. 리스트의 요소를 문자열로 변환하여 반환하는 메서드.
     *
     * @param start 리스트의 시작 노드.
     * @return 리스트의 요소를 문자열로 반환.
     */
    public static String toString(Node start) {
        StringBuilder result = new StringBuilder("[");
        Node current = start;

        // TODO#2-1. 리스트의 요소를 순회하면서 문자열로 변환
        while (current != null) {
            // System.out.println(current.value);
            result.append(current.value+" ");
            current=current.next;
        }

        result.append("]");
        System.out.println("");
        return result.toString();
    }

    public static void main(String[] args) {
        Random random = new Random();

        // 빈 리스트 생성
        Node start = null;
        System.out.println("start : " + toString(start));

        // 10번 요소를 삽입
        for (int i = 0; i < 10; i++) {
            // 0 ~ 99 중 임의의 숫자 선택
            int newValue = random.nextInt(100);
            System.out.println("삽입할 숫자 : "+newValue);
            start = insert(start, newValue); // 새로운 요소를 삽입
            System.out.printf("insert %d : %s%n", newValue, toString(start));
        }

        // 최종 결과 출력
        System.out.println("finished : " + toString(start));
    }
}

class Node {
    int value;
    Node next;

    // 생성자
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

