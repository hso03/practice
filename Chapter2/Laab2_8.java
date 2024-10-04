package com.nhnacademy.linked_data_structures;

import java.util.Random;

public class Laab2_8 {
    /**
     * TODO#1. 리스트에서 주어진 요소를 찾아 제거하는 메서드.
     *
     * @param start 리스트의 시작 노드.
     * @param x     제거할 값.
     * @return 해당 요소가 제거된 후의 리스트 시작 노드.
     */
    public static Node delete(Node start, int x) {
        // TODO#1-1. 리스트가 비어 있을 경우 바로 반환
        if (start == null) {
            return start;
        }

        // TODO#1-2. 첫 번째 노드가 삭제할 값일 경우
        if (start.value == x) {
            return start=start.next;
        }

        // TODO#1-3. 리스트의 중간 또는 끝에서 삭제할 값을 찾음
        Node current = start;
        while (current.next != null && current.next.value == x) {
            current = current.next; // 삭제할 값이 있는 노드를 찾음
        }

        // TODO#1-4. 삭제할 값이 리스트에 있을 경우
        if (current.next != null) {
            current.next = current.next.next;
        }

        return start; // 리스트의 시작 노드를 반환
    }

    /**
     * 새로운 값을 정렬된 순서에 맞게 리스트에 삽입하는 메서드.
     *
     * @param start 리스트의 시작 노드.
     * @param value 삽입할 값.
     * @return 새로운 노드가 삽입된 리스트의 시작 노드.
     */
    public static Node insert(Node start, int value) {
        if (start == null) {
            return new Node(value); // 첫 번째 노드로 삽입
        }

        if (start.value > value) {
            Node newNode = new Node(value);
            newNode.next = start;
            return newNode;
        }

        Node current = start;
        while (current.next != null && current.next.value <= value) {
            current = current.next;
        }

        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;

        return start;
    }

    /**
     * 리스트의 요소를 문자열로 변환하여 반환하는 메서드.
     *
     * @param start 리스트의 시작 노드.
     * @return 리스트의 요소를 문자열로 반환.
     */
    public static String toString(Node start) {
        StringBuilder result = new StringBuilder("[");
        Node current = start;

        while (current != null) {
            result.append(current.value);
            current = current.next;
            if (current != null) {
                result.append(", ");
            }
        }

        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] values = new int[10];

        // 빈 리스트 생성
        Node start = null;
        System.out.println("start : " + toString(start));

        // 리스트에 10개의 요소 삽입
        for (int i = 0; i < 10; i++) {
            values[i] = random.nextInt(100);
            start = insert(start, values[i]);
            System.out.printf("insert %d : %s%n", values[i], toString(start));
        }

        System.out.println("finished : " + toString(start));

        // 리스트에서 5개의 요소를 제거
        for (int i = 0; i < 5; i++) {
            start = delete(start, values[i * 2]);
            System.out.printf("delete %d : %s%n", values[i * 2], toString(start));
        }

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