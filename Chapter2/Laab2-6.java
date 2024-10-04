package com.nhnacademy.linked_data_structures;

public class Laab2_6 {

    /**
     * TODO#2. 연결 리스트의 모든 요소를 출력하는 메서드.
     *
     * @param head 연결 리스트의 첫 번째 노드를 가리키는 참조.
     * @return 리스트 요소를 문자열 형태로 반환.
     */
    public static String toString(Node head) {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        
        // TODO#2-1. 반복문을 통해 리스트의 모든 요소를 문자열로 변환
        while (current != null) {
            result.append(current.value+" ");
            current=current.next;           
        }

        result.append("]"); 
        return result.toString();
    }

    public static void main(String[] args) {
        // 첫 번째 노드 (head) 생성
        Node head = new Node(22);

        // TODO#1. 노드를 순차적으로 연결
        Node p = head;
        for(int i=0;i<4;i++){
            p.next = new Node(33+11*i);
            p=p.next;
        }
        
        // 리스트의 모든 요소를 출력
        System.out.println(toString(head)); // head 노드를 시작으로 리스트 출력
    }

}


class Node {
    int value; // 노드의 값
    Node next; // 다음 노드를 가리키는 참조

    // 노드를 생성하는 생성자
    public Node(int value) {
        this.value = value;
        this.next = null; // 초기에는 다음 노드를 가리키지 않음
    }
}

