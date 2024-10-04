public class Lab3_5 {
    public static void main(String[] args) {
        SimpleSingleLinkedList list = new SimpleSingleLinkedList();
        
        // 요소 추가
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list); // [10, 20, 30, 40]
        
        // 특정 요소 제거
        list.remove(30);
        System.out.println(list); // [10, 20, 40]

        // 요소 제거 실패
        System.out.println("Remove 50: " + list.remove(50)); // false
        System.out.println(list); // [10, 20, 40]

        // 반복자를 이용한 순회 및 요소 제거
        SimpleListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println("Iterator value: " + value);
            if (value == 20) {
                iterator.remove(); // 현재 요소를 제거
            }
        }

        System.out.println(list); // [10, 40]
    }
}
