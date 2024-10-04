public class ArrayQueue implements Queue {
    private int[] queueArray; // 큐의 요소를 저장할 배열
    private int front; // 큐의 앞쪽 인덱스 (제거할 위치)
    private int rear; // 큐의 뒤쪽 인덱스 (추가할 위치)
    private int size; // 현재 큐의 크기
    private static final int DEFAULT_CAPACITY = 10; // 기본 용량

    /**
     * 기본 생성자 - 큐의 기본 용량으로 배열을 초기화합니다.
     */
    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 사용자 정의 용량을 받는 생성자 - 주어진 용량으로 배열을 초기화합니다.
     *
     * @param capacity 큐의 초기 용량
     */
    public ArrayQueue(int capacity) {
        // TODO#1 capacity가 유효한 값인지 검증을 하라.
        if (capacity<0) {
            throw new IllegalArgumentException("큐의 용량은 0보다 커야 합니다.");
        }
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    /**
     * 큐에 요소를 추가합니다.
     * 배열의 끝에 도달했을 경우 NotEnoughMemoryException을 발생시킵니다.
     *
     * @param element 추가할 요소
     * @throws NotEnoughMemoryException 배열이 가득 찼을 경우 발생
     */
    @Override
    public void enqueue(int element) {
        // TODO#2 배열에 더 이상 요소 추가가 어렵다면 exception을 발생시켜라.
        if (size==queueArray.length) {
            throw new NotEnoughMemoryException("배열의 끝에 도달했습니다. 더 이상 요소를 추가할 수 없습니다.");
        }

        // TODO#3 배열에 요소를 추가하라.
        /* ... */// rear를 다음 위치로 이동 // rear은 추가 // front는 삭제
        rear++;
        /* ... */ // 요소를 배열에 추가
        queueArray[rear]=element;
        /* ... */ // 큐의 크기 증가
        size++;
    }

    /**
     * 큐에서 요소를 제거하고 반환합니다.
     *
     * @return 제거된 요소
     * @throws EmptyQueueException 큐가 비어 있을 경우 발생
     */
    @Override
    public int dequeue() {
        // TODO#4 저장된 요소가 없다면, exception을 발생시켜라.
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        // TODO#5 가장 먼저 삽입한 요소를 반환하고, 배열에서 삭제하라.
        /* ... */
        int removedElement=queueArray[front];
        System.arraycopy(queueArray, 1, queueArray, 0, size-1);
        rear--;
        size--;
        return removedElement;
    }

    /**
     * 큐의 앞쪽 요소를 제거하지 않고 반환합니다.
     *
     * @return 큐의 앞쪽 요소
     * @throws EmptyQueueException 큐가 비어 있을 경우 발생
     */
    @Override
    public int peek() {
        // TODO#6 저장된 요소가 없다면, exception을 발생시켜라.
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        // TODO#7 가장 먼저 삽입한 요소를 반환하라.
        return queueArray[front];
    }

    /**
     * 큐가 비어 있는지 확인합니다.
     *
     * @return 큐가 비어 있으면 true, 그렇지 않으면 false
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 큐의 크기를 반환합니다.
     *
     * @return 현재 큐의 크기
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 큐의 모든 요소를 문자열로 반환합니다.
     *
     * @return 큐의 요소를 포함한 문자열
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = front; i <= rear; i++) {
            sb.append(queueArray[i]);
            if (i < rear) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
