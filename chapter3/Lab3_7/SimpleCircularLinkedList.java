import java.util.NoSuchElementException;

/**
 * SimpleCircularLinkedList 클래스는 이중 연결 순환 리스트를 구현한 클래스입니다.
 * 마지막 노드는 항상 첫 번째 노드를 가리키며, 양방향 탐색과 순환 구조를 지원합니다.
 */
public class SimpleCircularLinkedList implements SimpleList {
    /**
     * 이중 연결 리스트의 각 노드를 나타내는 클래스입니다.
     */
    private static class Node {
        int data; // 노드의 데이터
        Node prev; // 이전 노드를 가리키는 참조
        Node next; // 다음 노드를 가리키는 참조

        /**
         * Node 클래스의 생성자. 주어진 데이터를 저장하는 노드를 생성합니다.
         *
         * @param data 노드가 저장할 데이터
         */
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node tail; // 리스트의 마지막 노드를 가리킴
    private int size; // 리스트에 저장된 요소의 개수

    /**
     * SimpleCircularLinkedList 생성자. 빈 리스트를 생성합니다.
     */
    public SimpleCircularLinkedList() {
        tail = null;
        size = 0;
    }

    /**
     * 리스트가 비어 있는지 확인합니다.
     *
     * @return 리스트가 비어 있으면 true, 그렇지 않으면 false
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 리스트의 끝에 새로운 요소를 추가합니다.
     *
     * @param data 추가할 요소의 데이터
     */
    @Override
    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            // TODO#1 리스트가 비워져 있을때 새로운 노드를 추가하면, 노드의 next, previous는 자신이 된다.
            /* ... */ // 첫 번째 노드는 자기 자신을 가리킴
            tail = newNode;
            tail.next=tail;
            tail.prev=tail;
        } else {
            // TODO#2 새로운 노드는 tail 자리에 와야한다.//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            // 새로운 노드가 첫 번째 노드를 가리킴
            /* ... */
            newNode.next=tail.next;

            // 새로운 노드의 이전 노드는 마지막 노드를 가리킴
            /* ... */
            newNode.prev=tail;

            // 기존의 첫 번째 노드의 이전 노드를 새 노드로 설정
            /* ... */
            tail.next.prev=newNode;

            // 마지막 노드의 다음 노드를 새 노드로 설정
            /* ... */
            tail.next=newNode;

            // tail을 새로운 노드로 업데이트
            /* ... */;
            tail=newNode;
        }
        size++;
    }

    /**
     * 리스트의 첫 번째 요소로 새로운 요소를 추가합니다.
     *
     * @param data 추가할 요소의 데이터
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            // TODO#3 리스트가 비워져 있을때 새로운 노드를 추가하면, 노드의 next, previous는 자신이 된다.
            /* ... */// 첫 번째 노드는 자기 자신을 가리킴
            tail = newNode;
            tail.next=newNode;
            tail.prev=newNode;
        } else {
            // TODO#4 새로운 노드는 tail 다음에 와야한다.
            // 새로운 노드가 기존의 첫 번째 노드를 가리킴
            /* ... */
            // 새로운 노드의 이전 노드는 마지막 노드를 가리킴
            /* ... */
            // 기존의 첫 번째 노드의 이전 노드를 새 노드로 설정
            /* ... */
            // 마지막 노드의 다음 노드를 새 노드로 설정
            /* ... */
            newNode.next=tail.next;
            newNode.prev=tail;
            tail.next.prev=newNode;
            tail.next=newNode;
        }
        size++;
    }

    /**
     * 리스트의 첫 번째 요소를 제거하고 그 값을 반환합니다.
     *
     * @return 제거된 첫 번째 요소의 데이터
     * @throws RuntimeException 리스트가 비어 있을 경우 발생
     */
    @Override
    public int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("리스트가 비어 있습니다.");
        }

        // TODO#5 첫번째 노드를 삭제 노드로 지정한다.
        Node head = tail.next;                /* ... */ // 첫 번째 노드를 가리킴
        int removedData = head.data;

        if (tail == head) { // 리스트에 노드가 하나일 경우
            // TODO#6 노드가 1개 였다면?
            /* ... */
            tail=null;
        } else {
            // TODO#7 첫번째 노드 제거
            /* ... */ // tail의 next를 두 번째 노드로 설정
            /* ... */ // 새로운 첫 번째 노드의 이전 노드를 tail로 설정
            tail.next=head.next;
            head.next.prev=tail;
        }

        size--;
        return removedData;
    }

    /**
     * 리스트의 마지막 요소를 제거하고 그 값을 반환합니다.
     *
     * @return 제거된 마지막 요소의 데이터
     * @throws RuntimeException 리스트가 비어 있을 경우 발생
     */
    public int removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("리스트가 비어 있습니다.");
        }

        int removedData = tail.data;

        if (tail == tail.next) { // 리스트에 노드가 하나일 경우
            // TODO#8 노드가 1개 였다면?
            tail=null;
        } else {
            // TODO#9 마지막 노드 제거이므로, tail을 이전 노드로 변경하라.
            /* ... */
            // 마지막 노드의 이전 노드가 첫 번째 노드를 가리킴
            /* ... */
            tail.prev.next=tail.next;
            // 첫 번째 노드의 이전 노드를 tail의 이전 노드로 설정
            tail.next.prev=tail.prev;
            /* ... */ // tail을 이전 노드로 이동
            tail=tail.prev;

        }

        size--;
        return removedData;
    }

    /**
     * 리스트에서 지정된 값을 가진 노드를 제거합니다.
     *
     * @param data 제거할 요소의 데이터
     * @return 제거 성공 시 true, 제거할 값이 없으면 false
     */
    @Override
    public boolean remove(int data) {
        if (isEmpty()) {
            return false;
        }

        Node current = tail.next; // 첫 번째 노드를 가리킴
        do {
            if (current.data == data) {
                if (current == tail.next) {
                    // 첫 번째 노드를 삭제하는 경우
                    // TODO#10 첫번째 노드인 경우, 정의되어 있는 메소드 호출
                    /* ... */
                    remove();
                } else if (current == tail) {
                    // 마지막 노드를 삭제하는 경우
                    // TODO#11 마지막 노드인 경우, 정의되어 있는 메소드 호출
                    removeLast();
                } else {
                    // TODO#12 중간 노드인 경우는 삭제 노드 앞뒤 노드의 연결을 정리하면 된다.
                    /* ... */
                    current.next.prev=current.prev;
                    current.prev.next=current.next;
                }
                size--;
                return true;
            }
            current = current.next;
        } while (current != tail.next);

        return false;
    }

    /**
     * 리스트에 지정된 값이 있는지 확인합니다.
     *
     * @param data 확인할 요소의 데이터
     * @return 값이 존재하면 true, 존재하지 않으면 false
     */
    @Override
    public boolean contains(int data) {
        if (isEmpty()) {
            return false;
        }

        Node current = tail.next; // 첫 번째 노드를 가리킴
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != tail.next);

        return false;
    }

    /**
     * 리스트의 요소 개수를 반환합니다.
     *
     * @return 리스트의 요소 개수
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 리스트의 모든 요소를 문자열로 반환합니다.
     *
     * @return 리스트의 요소를 포함한 문자열
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = tail.next; // 첫 번째 노드를 가리킴
        do {
            sb.append(current.data);
            if (current.next != tail.next) {
                sb.append(", ");
            }
            current = current.next;
        } while (current != tail.next);

        sb.append("]");
        return sb.toString();
    }

    /**
     * 리스트의 요소를 순회하는 Iterator를 반환합니다.
     *
     * @return SimpleListIterator 인터페이스를 구현한 반복자
     */
    public SimpleListIterator listIterator() {/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        return new SimpleCircularLinkedListIterator();
    }

    /**
     * SimpleCircularLinkedList를 위한 반복자 클래스입니다.
     * 리스트를 양방향으로 탐색하고, 요소를 제거할 수 있습니다.
     */
    private class SimpleCircularLinkedListIterator implements SimpleListIterator {
        private Node current = (tail == null) ? null : tail.next; // 첫 번째 노드를 가리킴 // 조건식 ? A : B => 조건식이 true면 A, false면 B
        private Node lastReturned = null;

        /**
         * 리스트에 다음 요소가 있는지 확인합니다.
         *
         * @return 다음 요소가 존재하면 true, 없으면 false
         */
        @Override
        public boolean hasNext() {
            return size > 0 && current != null;
        }

        /**
         * 리스트의 다음 요소를 반환하고, 포인터를 다음으로 이동합니다.
         *
         * @return 다음 요소의 데이터
         * @throws IndexOutOfBoundsException 리스트에 더 이상 요소가 없을 경우 발생
         */
        @Override
        public int next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("더 이상 요소가 없습니다.");
            }
            lastReturned = current;
            current = current.next;
            return lastReturned.data;
        }

        /**
         * 리스트에 이전 요소가 있는지 확인합니다.
         *
         * @return 이전 요소가 존재하면 true, 없으면 false
         */
        @Override
        public boolean hasPrevious() {
            return size > 0 && current != null;
        }

        /**
         * 리스트의 이전 요소를 반환하고, 포인터를 이전으로 이동합니다.
         *
         * @return 이전 요소의 데이터
         * @throws IndexOutOfBoundsException 리스트에 더 이상 이전 요소가 없을 경우 발생
         */
        @Override
        public int previous() {
            if (!hasPrevious()) {
                throw new IndexOutOfBoundsException("더 이상 이전 요소가 없습니다.");
            }
            current = current.prev;
            lastReturned = current;
            return lastReturned.data;
        }

        /**
         * 현재 요소를 리스트에서 제거합니다.
         *
         * @throws IllegalStateException 현재 제거할 요소가 없을 경우 발생
         */
        @Override
        public void remove() {

            if (lastReturned == null) {
                throw new IllegalStateException("제거할 요소가 없습니다.");
            }

            if (lastReturned == tail.next) { // 첫 번째 노드를 삭제하는 경우
                // TODO#13 첫번째 노드인 경우, 정의되어 있는 메소드 호출 (Outer 클래스의 this를 호출하려면?)
                /* ... */
                SimpleCircularLinkedList.this.remove();
            } else if (lastReturned == tail) { // 마지막 노드를 삭제하는 경우
                // TODO#14 첫번째 노드인 경우, 정의되어 있는 메소드 호출 (Outer 클래스의 this를 호출하려면?)
                /* ... */
                SimpleCircularLinkedList.this.removeLast();
            } else {
                lastReturned.prev.next = lastReturned.next;
                lastReturned.next.prev = lastReturned.prev;
                size--;
            }
            lastReturned = null;
        }
    }
}
