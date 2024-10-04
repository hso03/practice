public class ArrayQueue implements Queue {
    private int[] queueArray; // 큐의 요소를 저장할 배열
    private int front; // 큐의 앞쪽 인덱스 (제거할 위치)
    private int rear; // 큐의 뒤쪽 인덱스 (추가할 위치)
    private int size; // 현재 큐의 크기
    private static final int DEFAULT_CAPACITY = 5; // 기본 용량

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
        if (capacity <= 0) {
            throw new IllegalArgumentException("큐의 용량은 0보다 커야 합니다.");
        }
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    /**
     * 큐에 요소를 추가합니다.
     * Circular Buffer(원형 버퍼)를 사용하여 배열의 앞쪽 공간을 재사용할 수 있습니다.
     *
     * @param element 추가할 요소
     */
    @Override
    public void enqueue(int element) {
        // TODO#1 원형 버퍼를 사용하는 경우라도 버퍼가 다 차면 확장시킨다.
        if (size==queueArray.length) {
            resize(); // 큐가 가득 차면 크기 확장
        }

        // TODO#2 새로운 요소 추가 후 rear를 잘 계산해 주자.
        /* ... */ // 새로운 요소 추가
        queueArray[rear]=element;
        /* ... */ // 원형 버퍼로 처리
        if(rear==queueArray.length-1){
            rear=0;
        }
        rear++;
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
        if (isEmpty()) {
            throw new EmptyQueueException();
        }

        // TODO#3 맨 앞 요소 제거 후 front를 잘 계산해 주자.
        /* ... */
        // 맨 앞 요소 백업
        /* ... */ // 원형 버퍼로 처리

        int removedElement = queueArray[front];
        if(front==queueArray.length){
            front=0;
        }
        front++;
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
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
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
     * 큐의 총 용량(배열의 크기)를 반환합니다.
     *
     * @return 큐의 용량
     */
    public int getCapacity() {
        return queueArray.length;
    }

    /**
     * 큐의 크기를 두 배로 확장합니다.
     * front와 rear 인덱스를 주의해서 처리해야 합니다.
     */
    private void resize() {
        int newCapacity = queueArray.length * 2; // 배열 크기를 두 배로 확장
        int[] newArray = new int[newCapacity];

        // 기존 배열의 데이터를 새로운 배열로 복사 (원형 큐 방식)
        for (int i = 0; i < size; i++) {
            newArray[i] = queueArray[(front + i) % queueArray.length];
        }

        queueArray = newArray; // 새로운 배열로 참조 변경
        front = 0; // front를 0으로 초기화
        rear = size; // rear는 size만큼 이동
    }

    /**
     * 큐의 모든 요소를 문자열로 반환합니다.
     *
     * @return 큐의 요소를 포함한 문자열
     */
    @Override
    public String toString() {
        if (isEmpty())
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(queueArray[(front + i) % queueArray.length]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
