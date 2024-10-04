/**
 * SimpleList 인터페이스는 리스트의 기본적인 기능을 정의합니다.
 */
public interface SimpleList {
    boolean isEmpty();

    void add(int data);

    int remove();

    boolean remove(int data);

    boolean contains(int data);

    int size();

    SimpleListIterator listIterator();
}