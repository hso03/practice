import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab3_2 {
    public static void main(String[] args) {
        // TODO#1. 알파벳 문자열 요소로 구성된 리스트 생성 및 출력
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("초기 리스트: " + list);

        // TODO#2-1. ListIterator 획득
        ListIterator<String> iterator = list.listIterator();

        // TODO#2-2. 다음 요소의 인덱스를 확인하고, 요소로 이동한 후 값 반환
        while (iterator.hasNext()) {
            System.out.println("nextIndex() : " + iterator.nextIndex());
            System.err.println("next() : "+ iterator.next());
        }

        // TODO#2-3. 이전 요소로 이동하여 인덱스와 값을 출력
        while (iterator.hasPrevious()) {
            System.out.println("previousIndex : " + iterator.previousIndex());
            System.out.println("previous : " + iterator.previous());
        }

        // 3. 요소 추가, 수정, 삭제 기능 검증
        // TODO#3-1. 두 번째 요소 뒤에 "F" 추가
        list.add(2,"F");
        System.out.println("요소 추가 후: " + list);

        // TODO#3-2. 두 번째 요소를 "Z"로 수정
        list.set(2, "Z");
        System.out.println("요소 수정 후: " + list);

        // TODO#3-3. 네 번째 요소를 삭제
        list.remove(4);
        System.out.println("요소 삭제 후: " + list);
    }
}
