public class Lab5_2 {
    /**
     * 테스트 메인 메서드
     */
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        // 큐에 요소 추가 (enqueue)
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue); // [10, 20, 30, 40, 50]

        // 배열이 가득 찬 상태에서 enqueue 호출 -> 배열 크기 확장
        queue.enqueue(60);
        queue.enqueue(70);
        System.out.println(queue); // [10, 20, 30, 40, 50, 60, 70]

        // 큐의 크기 확인
        System.out.println("Size: " + queue.size()); // 7

        // 큐의 앞쪽 요소 확인 (peek)
        System.out.println("Peek: " + queue.peek()); // 10

        // 큐에서 요소 제거 (dequeue)
        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.println(queue); // [20, 30, 40, 50, 60, 70]

        // 큐의 크기 확인
        System.out.println("Size: " + queue.size()); // 6
    }
}
