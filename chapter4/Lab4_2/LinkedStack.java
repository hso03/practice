
public class LinkedStack implements Stack {
    private Node top; // 스택의 맨 위 요소를 가리킴
    private int size; // 스택에 있는 요소의 개수

    /**
     * LinkedStack 생성자. 빈 스택을 생성합니다.
     */
    public LinkedStack() {
        top = null;
        size = 0;
    }

    /**
     * 스택에 요소를 추가합니다.
     *
     * @param element 추가할 요소
     */
    @Override
    public void push(int element) {
        // TODO#1 새로운 노드를 생성하여, top을 변경하라.
        Node newNode = new Node(element);
        if(isEmpty()){
            top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }


        /* ... */
        /* ... */
        // 새로운 노드의 next가 기존 top을 가리킴
        /* ... */ // top을 새로운 노드로 업데이트
        size++;
    }

    /**
     * 스택의 맨 위에 있는 요소를 제거하고 반환합니다.
     *
     * @return 제거된 요소의 값
     * @throws RuntimeException 스택이 비어 있을 경우 발생
     */
    @Override
    public int pop() {
        // TODO#2 스택이 비워져 있는지 검사하라.(EmptyStackException)
        /* ... */
        int topElement = top.data;
        if(isEmpty()){
            throw new RuntimeException();
        }else{
            top=top.next;
        }
        // TODO#3 top의 다음 노드를 새로운 top으로 변경하고, 기존 top이 가지고 있던 요소를 반환하라.
        /* ... */
        // top 값 저장
        /* ... */ // top을 다음 노드로 이동
        size--;
        return topElement;
    }

    /**
     * 스택의 맨 위에 있는 요소를 제거하지 않고 반환합니다.
     *
     * @return 스택의 맨 위 요소
     * @throws RuntimeException 스택이 비어 있을 경우 발생
     */
    @Override
    public int peek() {
        // TODO#4 스택이 비워져 있는지 검사하라.(EmptyStackException)
        /* ... */
        int topElement=top.data;
        if(isEmpty()){
            throw new RuntimeException();
        }

        // TODO#5 top 값을 반환하라.
        return topElement;
        /* ... */ // top의 데이터를 반환
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
     * 스택의 크기를 반환합니다.
     *
     * @return 스택에 있는 요소의 개수
     */
    @Override
    public int size() {
        return size;
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
        Node current = top;
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
