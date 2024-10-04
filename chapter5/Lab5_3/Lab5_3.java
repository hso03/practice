public class Lab5_3 {

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
        System.out.println("Capacity: " + queue.getCapacity()); // 10 (크기 확장됨)

        // 요소 하나씩 넣었다 빼기 반복
        queue.dequeue(); // 10 제거
        queue.enqueue(80); // 80 추가
        System.out.println(queue); // [20, 30, 40, 50, 60, 70, 80]

        queue.dequeue(); // 20 제거
        queue.enqueue(90); // 90 추가
        System.out.println(queue); // [30, 40, 50, 60, 70, 80, 90]

        // 큐의 크기와 용량 확인
        System.out.println("Size: " + queue.size()); // 7
        System.out.println("Capacity: " + queue.getCapacity()); // 10
    }
}
