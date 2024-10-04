import java.util.NoSuchElementException;

/**
 * SimpleSingleLinkedList 클래스는 단일 연결 리스트를 구현합니다.
 */
public class SimpleSingleLinkedList implements SimpleList {
    private Node head; // 첫 번째 노드를 가리킴
    private int size; // 리스트의 크기 (요소 수)

    /**
     * 기본 생성자: 빈 리스트를 생성합니다.
     */
    public SimpleSingleLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * 리스트가 비어 있는지 확인합니다.
     *
     * @return 리스트가 비어 있으면 true, 그렇지 않으면 false
     */
    @Override
    public boolean isEmpty() {
        // TODO#1 리스트가 비워져 있음을 확인하여 반환하라.
        return head==null;
    }

    /**
     * 리스트의 끝에 요소를 추가합니다.
     *
     * @param data 추가할 요소의 값
     */
    @Override
    public void add(int data) {
        Node newNode = new Node(data);

        // TODO#2 리스트가 비어 있으면 새 노드를 헤드로 설정하라.
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            // TODO#3 그렇지 않다면, 리스트 끝까지 이동 후 추가하라
            while(current.next!=null){
                current=current.next;
            }

            // 마지막 노드에 새 노드 추가
            current.next=newNode;
        }
        size++;
    }

    /**
     * 리스트의 첫 번째 요소를 제거하고 반환합니다.
     *
     * @return 제거된 요소의 값
     * @throws RuntimeException 리스트가 비어 있을 경우 발생
     */
    @Override
    public int remove() {
        // TODO#4 제거할 요소가 없다면? NoSuchElementException 발생
        if(isEmpty()){
            throw new NoSuchElementException("제거할 요소 없음");
        }

        // TODO#5 제거할 요소값은 반환을 위해 임시 저장해 두고, 노드 삭제(헤더 변경) 후 반환
        int removedata = head.data;
        head=head.next;
        size--;
        return removedata;
    }

    /**
     * 리스트에서 특정 값을 찾아 제거합니다.
     *
     * @param data 제거할 요소의 값
     * @return 요소 제거에 성공하면 true, 실패하면 false
     */
    @Override
    public boolean remove(int data) {
        if (isEmpty()) {
            return false;
        }

        // TODO#6 첫 번째 요소가 제거할 값인 경우
        if (head.data == data) {
            remove();
            return true;
        }

        // TODO#7 그 외의 경우, 리스트를 순차적으로 탐색
        Node current = head;
        while(current.next!=null){
            if(current.next.data==data){
                current.next=current.next.next;
                size--;
                return true;
            }
            current=current.next;
        }
        return false; // 요소를 찾지 못한 경우
    }

    /**
     * 리스트에 특정 요소가 존재하는지 확인합니다.
     *
     * @param data 찾을 요소의 값
     * @return 요소가 존재하면 true, 존재하지 않으면 false
     */
    @Override
    public boolean contains(int data) {
        // TODO#8 remove(int data)와 유사하지만, 제거가 없으므로 좀 더 간결하게
        Node current = head;
        while(current!=null){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }

        return false;
    }

    /**
     * 리스트에 있는 요소의 수를 반환합니다.
     *
     * @return 현재 리스트의 요소 수
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
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
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

    /**
     * 리스트의 요소를 순회하는 SimpleListIterator를 반환합니다.
     *
     * @return SimpleListIterator 인터페이스를 구현한 반복자
     */
    @Override
    public SimpleListIterator listIterator() {
        return new SimpleSingleLinkedListIterator();
    }

    /**
     * SimpleSingleLinkedListIterator 클래스는 리스트의 요소를 순회하는 반복자입니다.
     */
    private class SimpleSingleLinkedListIterator implements SimpleListIterator {
        private Node current = head;
        private Node lastReturned = null;

        /**
         * 다음 요소가 존재하는지 확인합니다.
         *
         * @return 다음 요소가 존재하면 true, 그렇지 않으면 false
         */
        @Override
        public boolean hasNext() {
            // TODO#9 다음 요소가 있다의 의미는?
            return current!=null;
        }



        /**
         * 다음 요소를 반환하고, 커서를 이동합니다.
         *
         * @return 다음 요소의 값
         * @throws IndexOutOfBoundsException 더 이상 요소가 없을 경우 발생
         */
        @Override
        public int next() {
            // TODO#10 다음 요소가 있는지 확인. 없다면? IndexOutOfBoundsException
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("요소 없음");
            }

            // TODO#11 반환값 저장 후 current 이동하고 반환
            int retrundata=current.data;
            lastReturned = current;
            current=current.next;
            return retrundata;
        }

        /**
         * 이전 요소는 지원되지 않으며, 호출 시 예외를 발생시킵니다.
         *
         * @throws UnsupportedSupportedException 지원하지 않는 메서드
         */
        @Override
        public boolean hasPrevious() {
            // TODO#12 Single Linked List는 이전으로 돌아가지 못한다. 따라서...
            throw new UnsupportedOperationException();
        }

        /**
         * 이전 요소는 지원되지 않으며, 호출 시 예외를 발생시킵니다.
         *
         * @throws UnsupportedSupportedException 지원하지 않는 메서드
         */
        @Override
        public int previous() {
            // TODO#13 Single Linked List는 이전으로 돌아가지 못한다. 따라서...
            throw new UnsupportedOperationException();
        }

        /**
         * 현재 요소를 제거합니다.
         *
         * @throws IllegalStateException 현재 요소가 없거나 이미 제거된 경우 발생
         */
        @Override
        public void remove() {
            // TODO#14 이전에 삭제하거나 한번도 이동(next)이 없었다면?
            if (lastReturned == null) {
                throw new IllegalStateException();
            }

            // TODO#15 current 삭제. 그리고, current가 두번 삭제되지 않도록?
l            Node p = head;\
            while(p.next!=null){
                if(p.next==lastReturned){
                    p.next=p.next.next;
                    size--;
                    lastReturned=null;
                    return;
                }
            }
        }
    }
}
