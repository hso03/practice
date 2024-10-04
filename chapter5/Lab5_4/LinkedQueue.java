public class LinkedQueue implements Queue {
    private Node front; // 큐의 앞쪽 요소 (제거될 요소)
    private Node rear; // 큐의 뒤쪽 요소 (추가될 요소)
    private int size; // 현재 큐의 크기

    /**
     * 기본 생성자 - 빈 큐로 초기화합니다.
     */
    public LinkedQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    /**
     * 큐에 요소를 추가합니다.
     *
     * @param element 추가할 요소
     */
    @Override
    public void enqueue(int element) {
        Node newNode = new Node(element);

        // TODO#1 큐가 비어 있으면, front와 rear가 모두 새 노드를 가리킵니다.
        /* ... */
        if(isEmpty()){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
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

        // TODO#2 맨 앞 요소를 반환하고, 해당 노드를 리스트에서 제외 시켜라.
        /* ... */
        int removedElement=front.data;
        front=front.next;
        size--; // 큐의 크기 감소
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
        return front.data; // front에 저장된 데이터를 반환
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
        if (isEmpty())
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = front;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
