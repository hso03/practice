public interface Queue {
    void enqueue(int element);

    int dequeue();

    int peek();

    boolean isEmpty();

    int size();
}
