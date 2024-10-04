
import java.util.*;

/**
 * SimpleArrayList 클래스는 배열을 기반으로 한 리스트 구현체입니다.
 * 리스트의 크기는 요소가 추가될 때 자동으로 확장됩니다.
 */
public class SimpleArrayList implements SimpleList {
    // TODO#1 필드 선언
    private int[] array; // 내부 배열
    private int size; // 현재 요소 개수

    // 기본 배열 크기
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 기본 크기(10)로 ArrayList를 생성합니다.
     */
    public SimpleArrayList() {
        // TODO#2 기본 크기를 같도록 설정. (코드를 재사용할 것)
        this(DEFAULT_CAPACITY);
    }

    /**
     * 지정된 크기로 ArrayList를 생성합니다.
     *
     * @param initialCapacity 초기 배열 크기
     * @throws IllegalArgumentException 초기 크기가 0 이하일 경우 발생
     */
    public SimpleArrayList(int initialCapacity) {
        // TODO#3 initialCapacity가 잘못된 값인 경우,
        // IllegalArgumentException("초기 용량은 0보다 커야 합니다.")
        if(initialCapacity<=0){
            throw new IllegalArgumentException("초기 용량은 0보다 커야합니다.");   
        }
        this.array = new int[initialCapacity];
        this.size = 0;
        
    }

    /**
     * 리스트가 비어 있는지 확인합니다.
     *
     * @return 리스트가 비어 있으면 true, 그렇지 않으면 false
     */
    @Override
    public boolean isEmpty() {
        // TODO#4 리스트가 비어 있는 조건 확인
        return size==0;
    }

    /**
     * 리스트의 끝에 요소를 추가합니다.
     * 필요 시 배열의 크기를 자동으로 확장합니다.
     *
     * @param data 추가할 요소
     */
    @Override
    public void add(int data) {
        // TODO#5 배열이 가득 찬 경우 확장
        resizeArray();

        //배열에 맨뒤에 요소 추가
        array[size++] = data;
    }

    /**
     * 리스트의 첫 번째 요소를 제거하고 반환합니다.
     *
     * @return 제거된 첫 번째 요소
     * @throws RuntimeException 리스트가 비어 있는 경우 발생
     */
    @Override
    public int remove() {
        // TODO#6 리스트가 비워져 있다면,
        // RuntimeException("리스트가 비어 있습니다.");
        if(isEmpty()){
            throw new RuntimeException("리스트가 비어 있습니다.");
        }

        // TODO#7 첫번째 요소 제거 후 자리 이동
        int removedElement=array[0];
        System.arraycopy(array, 1, array, 0, size-1);
        size--;
        return removedElement;
    }

    /**
     * 리스트에서 특정 값을 찾아 제거합니다.
     *
     * @param data 제거할 요소
     * @return 요소 제거에 성공하면 true, 실패하면 false
     */
    @Override
    public boolean remove(int data) {
        // TODO#8 주어진 요소를 찾아 삭제
        /* ... */

        return false;
    }

    /**
     * 리스트에 특정 값이 존재하는지 확인합니다.
     *
     * @param data 찾을 값
     * @return 값이 존재하면 true, 존재하지 않으면 false
     */
    @Override
    public boolean contains(int data) {
        // TODO#8 주어진 요소가 있는지 확인
        /* ... */

        return false;
    }

    /**
     * 리스트에 있는 요소의 개수를 반환합니다.
     *
     * @return 현재 리스트의 요소 개수
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 리스트의 모든 요소를 문자열로 반환합니다.
     *
     * @return 리스트의 요소를 포함한 문자열 (예: [1, 2, 3])
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * 내부 배열의 크기를 두 배로 확장합니다.
     * 기존 배열의 요소는 새로운 배열로 복사됩니다.
     */
    private void resizeArray() {
        // TODO#9 배열 크기 조절
        System.arraycopy(size, size, this, size, size);
    }

    /**
     * ArrayList의 요소를 순회하는 SimpleListIterator를 반환합니다.
     *
     * @return 리스트 요소를 순회하는 SimpleListIterator
     */
    public SimpleListIterator iterator() {
        return new SimpleArrayListIterator();
    }

    /**
     * SimpleArrayListIterator 클래스는 리스트의 요소를 순회하고, 요소를 삭제하는 기능을 제공합니다.
     */
    private class SimpleArrayListIterator implements SimpleListIterator {
        private int currentIndex = -1;
        private boolean removed = false;

        /**
         * 다음 요소가 존재하는지 확인합니다.
         *
         * @return 다음 요소가 존재하면 true, 그렇지 않으면 false
         */
        @Override
        public boolean hasNext() {
            // TODO#10 다음 요소가 있는지 확인
            /* ... */
        }

        /**
         * 다음 요소를 반환하고, 커서를 이동합니다.
         *
         * @return 다음 요소
         * @throws IndexOutOfBoundsException 다음 요소가 없을 경우 발생
         */
        @Override
        public int next() {
            // TODO#11 다음 요소가 없다면?
            if (/* ... */) {
                throw new IndexOutOfBoundsException("더 이상 요소가 없습니다.");
            }
            removed = false;
            return array[++currentIndex];
        }

        /**
         * 이전 요소가 존재하는지 확인합니다.
         *
         * @return 이전 요소가 존재하면 true, 그렇지 않으면 false
         */
        @Override
        public boolean hasPrevious() {
            // TODO#12 이전 요소가 있는지 확인
        }

        /**
         * 이전 요소를 반환하고, 커서를 이동합니다.
         *
         * @return 이전 요소
         * @throws IndexOutOfBoundsException 이전 요소가 없을 경우 발생
         */
        @Override
        public int previous() {
            // TODO#13 이전 요소가 없다면?
            if (/* ... */) {
                throw new IndexOutOfBoundsException("앞에 더 이상 요소가 없습니다.");
            }
            removed = false;
            return array[--currentIndex];
        }

        /**
         * 현재 요소를 제거합니다.
         *
         * @throws IllegalStateException 요소를 제거할 수 없는 상태일 때 발생
         */
        @Override
        public void remove() {
            // TODO#14 current 요소가 없는 경우.
            if (/* ... */) {
                throw new IllegalStateException("제거할 요소가 없습니다.");
            }
            // TODO#15 현재 요소 제거
            /* ... */

            size--;
            removed = true;
            currentIndex--;
        }
    }
}
