import java.util.Arrays;

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
        // TODO#1 capacity가 유효한 값인지 확인하라.
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
     * 큐가 가득 차면 배열의 크기를 두 배로 확장합니다.
     *
     * @param element 추가할 요소
     */
    @Override
    public void enqueue(int element) {
        // TODO#2 큐가 가득 차면 크기를 두 배로 확장하라
        if (size==queueArray.length) {
            /* ... */
            resize();
        }

        rear++; // rear를 다음 위치로 이동
        queueArray[rear] = element; // 요소를 배열에 추가
        size++; // 큐의 크기 증가
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
        int removedElement = queueArray[front];
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
     * 큐의 크기를 두 배로 확장합니다.
     * front와 rear 인덱스를 주의해서 처리해야 합니다.
     */
    private void resize() {
        int newCapacity = queueArray.length * 2; // 배열 크기를 두 배로 확장
        int[] newArray = new int[newCapacity];

        // TODO#3 기존 배열의 데이터를 새로운 배열로 복사
        // front부터 rear까지 순차적으로 복사
        /* ... */
        System.arraycopy(queueArray, front, newArray, front, rear+1);
        this.queueArray = newArray;
        

        // TODO#4 새로운 배열 기준으로 정보 변경
        /* ... */
        // 새로운 배열로 참조 변경
        /* ... */
        // front를 0으로 초기화
        /* ... */ // rear는 마지막 요소의 인덱스로 설정
    }

    /**
     * 큐의 모든 요소를 문자열로 반환합니다.
     *
     * @return 큐의 요소를 포함한 문자열
     */
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(queueArray, front, rear + 1));
    }

    public int getca(){
        return queueArray.length;
    }

}
