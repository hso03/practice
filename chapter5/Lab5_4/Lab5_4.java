public class Lab5_4 {
    /**
     * 테스트 메인 메서드
     */
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        // 큐에 요소 추가 (enqueue)
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue); // [10, 20, 30, 40]

        // 큐의 크기 확인
        System.out.println("Size: " + queue.size()); // 4

        // 큐의 앞쪽 요소 확인 (peek)
        System.out.println("Peek: " + queue.peek()); // 10

        // 큐에서 요소 제거 (dequeue)
        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.println(queue); // [20, 30, 40]

        // 큐의 크기 확인
        System.out.println("Size: " + queue.size()); // 3
    }
}
