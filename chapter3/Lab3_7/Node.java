public class Node {
    int data;
    Node prev; // 이전 노드를 가리킴
    Node next; // 다음 노드를 가리킴

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}