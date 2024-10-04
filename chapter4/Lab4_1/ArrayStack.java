
import java.util.NoSuchElementException;

public class ArrayStack implements Stack {
    private int[] stackArray; // 스택의 요소를 저장할 배열
    private int size; // 현재 스택의 크기
    private int capacity; // 스택의 용량
    private static final int DEFAULT_CAPACITY = 10; // 기본 용량

    /**
     * 기본 생성자 - 스택의 기본 용량으로 배열을 초기화합니다.
     */
    public ArrayStack() {
        // TODO#1 기본 용량으로 배열을 초기화 시켜라.(코드 중복이 최소화 되도록 하라)
        /* ... */
        this(DEFAULT_CAPACITY);
    }

    /**
     * 사용자 정의 용량을 받는 생성자 - 주어진 용량으로 배열을 초기화합니다.
     *
     * @param capacity 스택의 초기 용량
     */
    public ArrayStack(int capacity) {
        // TODO#2 초기 용량으로 지정된 값이 유효한지 검증하라.
        /* ... */
        if(capacity<=DEFAULT_CAPACITY){
            this.capacity = capacity;
        }else{
            this.capacity=DEFAULT_CAPACITY;
        }
        stackArray = new int[capacity];
        size = 0;
    }

    /**
     * 스택이 비어 있는지 확인합니다.
     *
     * @return 스택이 비어 있으면 true, 그렇지 않으면 false
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 스택에 있는 요소의 개수를 반환합니다.
     *
     * @return 스택의 크기
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 스택의 맨 위에 요소를 추가합니다.
     * 내부 배열이 꽉 찼을 경우 배열을 확장합니다.
     *
     * @param element 추가할 요소
     */
    @Override
    public void push(int element) {
        // TODO#3 빈 공간이 없다면, 배열을 확장하라.
        /* ... */
        if(capacity==size){
            expandCapacity();
        }
        stackArray[size] = element; // 새로운 요소 추가
        size++;
    }

    /**
     * 스택의 맨 위에 있는 요소를 제거하고 반환합니다.
     *
     * @return 스택의 맨 위 요소
     * @throws NoSuchElementException 스택이 비어 있을 경우 발생
     */
    @Override
    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("스택이 비어 있습니다.");
        }
        // TODO#4 맨 위 요소를 반환하고, top을 이동 시켜라.
        /* ... */
        size--;
        return stackArray[size];
    }

    /**
     * 스택의 맨 위에 있는 요소를 제거하지 않고 반환합니다.
     *
     * @return 스택의 맨 위 요소
     * @throws RuntNoSuchElementExceptionimeException 스택이 비어 있을 경우 발생
     */
    @Override
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("스택이 비어 있습니다.");
        }
        // TODO#5 맨 위 요소 참조하라.
        /* ... */ // 맨 위 요소 반환
        return stackArray[size-1];
    }

    /**
     * 내부 배열의 용량을 확장합니다. 기본 확장 단위는 DEFAULT_CAPACITY입니다.
     */
    private void expandCapacity() {
        // TODO#6 배열은 기본 용량만큼씩 확장하라.
        // 기본 확장 단위는 DEFAULT_CAPACITY
        /* ... */
        this.capacity=DEFAULT_CAPACITY;
        // 새로운 더 큰 배열 생성
        /* ... */
        int[] newStackArray = new int[DEFAULT_CAPACITY];
        // 기존 배열 복사
        /* ... */
        System.arraycopy(stackArray, 0, newStackArray, 0, size);
        // 새로운 배열로 참조 변경
        /* ... */
        stackArray=newStackArray;
    }

    /**
     * 스택의 모든 요소를 문자열로 출력합니다.
     *
     * @return 스택의 요소를 포함한 문자열
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(stackArray[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
