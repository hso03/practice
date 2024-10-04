
/**
 * SimpleListIterator 인터페이스는 리스트의 요소를 순회하고, 요소를 수정하는 기능을 제공합니다.
 */
public interface SimpleListIterator {
    boolean hasNext();

    int next();

    boolean hasPrevious();

    int previous();

    void remove();
}