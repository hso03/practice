public class Lab3_6 {
    public static void main(String[] args) {
        SimpleDoubleLinkedList list = new SimpleDoubleLinkedList();

        // 요소 추가
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list+"요소 추가"); // [10, 20, 30]
        
        // 앞에 요소 추가
        list.addFirst(5);
        System.out.println(list+"앞에 요소 추가"); // [5, 10, 20, 30]

        // 첫 번째 요소 제거
        list.remove();
        System.out.println(list+"첫 번째 요소 제거"); // [10, 20, 30]

        // 마지막 요소 제거
        list.removeLast();
        System.out.println(list+"마지막 요소 제거"); // [10, 20]

        // 요소 존재 확인
        System.out.println("Contains 20: " + list.contains(20)); // true
        System.out.println("Contains 30: " + list.contains(30)); // false

        list.remove(40);
        System.out.println(list+"40 제거");

        // 요소 순회 및 제거
        SimpleListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println("Iterator value: " + value);
            if (value == 20) {
                iterator.remove(); // 현재 요소를 제거
            }
        }

        System.out.println(list); // [10]
    }
}
