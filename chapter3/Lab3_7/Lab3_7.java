
public class Lab3_7 {
    public static void main(String[] args) {
        SimpleCircularLinkedList list = new SimpleCircularLinkedList();

        // 요소 추가
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list); // [10, 20, 30]

        // 순환 리스트를 확인하기 위해 next를 반복적으로 호출해 본다.
    System.out.print("next 반복 호출 : ");
        int count = 0;
        SimpleListIterator iterator = list.listIterator();
        while (iterator.hasNext() && count < 10) {
            System.out.printf("%d ", iterator.next());
            count++;
        }
        System.out.println();

        System.out.print("previous 반복 호출 : ");
        count = 10;
        iterator = list.listIterator();
        while (iterator.hasPrevious() && count > 0) {
            System.out.printf("%d ", iterator.previous());
            count--;
        }
        System.out.println();

        // 첫 번째 요소 제거
        list.remove();
        System.out.println(list); // [20, 30]

        // 마지막 요소 제거
        list.removeLast();
        System.out.println(list); // [20]

        list.remove(30);
        System.out.println(list);

        // 요소 존재 확인
        System.out.println("Contains 20: " + list.contains(20)); // true
        System.out.println("Contains 40: " + list.contains(40)); // false

        // 요소 순회 및 제거
        // iterator = list.listIterator();
        // while (iterator.hasNext()) {
        //     int value = iterator.next();
        //     System.out.println("Iterator value: " + value);
        //     if (value == 20) {
        //         iterator.remove(); // 현재 요소를 제거
        //     }
        // }

        // System.out.println(list); // []
    }

}
