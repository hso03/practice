package com.nhnacademy.linked_data_structures;

import java.util.Random;

public class Lab2_5 {
    /**
     * TODO#1. 새로운 요소를 삽입하고 노드 리스트를 업데이트하는 메서드.
     *
     * @param nodes 노드 배열.
     * @param free  삽입할 노드의 위치.
     * @param x     삽입할 값.
     */
    public static void insert(Node[] nodes, int free, int x) {
        // TODO#1-1. 인덱스 배열에서 삽입할 위치를 찾는다
        int index = 0;
        // nodes[i].next는 다음 요소의 위치를 나타내며, nodes[nodes[i].next].value가 삽입될 요소보다 큰 수이거나 마지막이 될 때까지 검색한다.

        while(nodes[index].next != 0 && nodes[nodes[index].next].value<x){
            index = nodes[index].next;
        }


        // while(nodes[nodes[index].next].value<x && nodes[nodes[index].next] != null && nodes[index].next != 0 ){

        //     index=nodes[index].next;
        // }


        // 새로운 요소를 free 위치에 추가
        nodes[free].value = x;

        // TODO#1-2. 삽입된 요소의 다음 인덱스를 기존 요소의 다음으로 설정
        nodes[free].next = nodes[index].next;


        // TODO#1-3. 이전 인덱스의 next를 free로 설정하여 삽입된 요소를 연결
        nodes[index].next = free;
    }

    /**
     * TODO#2. 노드 배열을 문자열로 변환하여 출력하는 메서드.
     *
     * @param nodes 노드 배열.
     * @return 정렬된 순서대로 배열의 요소를 문자열로 반환.
     */
    public static String toString(Node[] nodes) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        // 첫 번째 노드에서 시작
        int next = nodes[0].next;

        // TODO#2-1. 첫 번째 요소 출력
        if (next != 0) {
            builder.append(nodes[0].value+" ");
        }

        // TODO#2-2. 나머지 요소 출력
        while (next != 0) {
            builder.append(nodes[next].value+" ");
            next=nodes[next].next;
        }

        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Node[] nodes = new Node[10];

        // 노드 배열 초기화
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node();
        }

        // 요소를 9번 삽입
        for (int i = 0; i < 9; i++) {
            int x = random.nextInt(100); // 0~99 사이의 무작위 숫자 생성
            System.out.print(toString(nodes) + " + " + x);
            insert(nodes, i + 1, x); // 삽입할 위치는 free로 설정
            System.out.println(" = " + toString(nodes));
        }
    }
}

class Node {
    int value; // 노드의 값
    int next; // 다음 노드를 가리키는 인덱스

    // 기본 생성자 (초기 값 설정)
    public Node() {
        this.value = 0;
        this.next = 0;
    }
}