
import java.util.EmptyStackException;


public class LinkedStack implements Stack {
    private Node top; // 스택의 맨 위 요소를 가리킴
    private Node free; // 재활용할 노드를 관리하는 리스트의 시작
    private int size; // 스택에 있는 요소의 개수

    /**
     * LinkedStack 생성자. 빈 스택을 생성합니다.
     */
    public LinkedStack() {
        top = null;
        free = null;
        size = 0;
    }

    /**
     * 스택에 요소를 추가합니다.
     * 노드를 재활용하여 new 연산을 최소화합니다.
     *
     * @param element 추가할 요소
     */
    @Override
    public void push(int element) {
        Node newNode;
        // TODO#1 재활용할 노드가 있으면 가져와 사용하고, 없으면 새 노드를 생성하라
        if (free != null) {
            /* ... */
            newNode=free;
            // System.out.println(newNode.data);
            newNode.data=element;
            free=free.next;
            System.out.println(free.data);
            newNode.next=top;
            top=newNode;
        } else {
            /* ... */
            newNode = new Node(element);
            newNode.next=top;
            top=newNode;
        }



        // TODO#2 top을 새로운 노드로 변경하라
        /* ... */
        // 노드에 데이터 저장
        /* ... */
        // 새로운 노드의 next가 기존 top을 가리킴
        /* ... */// top을 새로운 노드로 업데이트
        size++;
    }

    /**
     * 스택의 맨 위에 있는 요소를 제거하고 반환합니다.
     * 제거된 노드는 free 리스트로 관리하여 재활용합니다.
     *
     * @return 제거된 요소의 값
     * @throws RuntimeException 스택이 비어 있을 경우 발생
     */
    @Override
    public int pop() {
        // TODO#3 빈 스택이라면 EmptyStackException
        /* ... */
        
        if(isEmpty()){
            throw new EmptyStackException();
        }

        // TODO#4 top을 제거하고, 다음 노드를 새로운 top으로 설정하라.
        /* ... */
        // top 저장
        /* ... */ // top을 다음 노드로 이동
        Node removedNode = top;
        top = top.next;
        size--;
        // TODO#5 제거된 노드를 free 리스트에 추가하고, 값은 반환하라.
        /* ... */
        removedNode.next=free;   
        free=removedNode;
        return removedNode.data;
    }

    /**
     * 스택의 맨 위에 있는 요소를 제거하지 않고 반환합니다.
     *
     * @return 스택의 맨 위 요소
     * @throws RuntimeException 스택이 비어 있을 경우 발생
     */
    @Override
    public int peek() {
        // TODO#6 빈 스택이라면 EmptyStackException
        /* ... */
        if(isEmpty()){
            throw new RuntimeException();
        }

        return top.data; // top의 데이터를 반환
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
