public class Lab4_3 {
    /**
     * 테스트 메인 메서드
     */
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        // 요소 추가 (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack); // [30, 20, 10]

        // 스택의 크기
        System.out.println("Size: " + stack.size()); // 3

        // 맨 위 요소 확인 (peek)
        System.out.println("Peek: " + stack.peek()); // 30

        // 맨 위 요소 제거 (pop)
        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println(stack); // [20, 10]

        // 스택 비었는지 확인 (isEmpty)
        System.out.println("Is Empty: " + stack.isEmpty()); // false

        // 모든 요소 제거
        System.out.println("Pop: " + stack.pop()); // 20
        System.out.println("Pop: " + stack.pop()); // 10
        System.out.println("Is Empty: " + stack.isEmpty()); // true

        // 새로운 요소 추가 및 재활용 노드 사용
        stack.push(70);
        System.out.println(stack); // [40]
        stack.push(80);
        System.out.println(stack); // [40]
    }
}
