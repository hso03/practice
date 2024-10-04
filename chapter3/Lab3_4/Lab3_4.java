public class Lab3_4 {
    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList(3);

        // 요소 추가
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40); // 배열 크기 확장 발생
        System.out.println(list); // [10, 20, 30, 40]

        // 요소 제거
        list.remove();
        System.out.println(list); // [20, 30, 40]

        // 요소 존재 확인
        System.out.println("Contains 30: " + list.contains(30)); // true
        System.out.println("Contains 50: " + list.contains(50)); // false

        // 특정 요소 제거
        list.remove(30);
        System.out.println(list); // [20, 40]

        // 요소 순회 및 제거
        SimpleListIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println("Iterator value: " + value);
            if (value == 20) {
                iterator.remove(); // 현재 요소를 제거
            }
        }

        System.out.println(list); // [40]
    }
}