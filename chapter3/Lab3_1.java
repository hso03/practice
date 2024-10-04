import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab3_1 {
    public static void main(String[] args) {
        // TODO#1. 초기 리스트 생성 및 출력 
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "A","B","C","D","E","F","G","H","I","J");
        System.out.println(list);


        // TODO#2-1. sublist() 메서드 활용: 4번째부터 8번째 요소 추출
        List<String> subList = list.subList(3, 8);
        System.out.println("list.subList(3,8): " + list.subList(3,8));

        // TODO#2-2. 서브리스트의 3번째 요소 출력하고 "B"로 변경
        System.out.println("list.subList(3,8).get(2): " + subList.get(2));
        // "F"를 "B"로 변경
        subList.set(2,"B");
        System.out.println("list.subList(3,8).set(2,\"B\"): " + list); // 원본 리스트에 반영 확인

        // TODO#3. 원본 리스트와 서브리스트 상호작용 확인
        System.out.println("list.indexOf(\"B\"): " + list.indexOf("B")); // 첫 번째 "B" 위치 확인
        System.out.println("list.subList(3,8).indexOf(\"B\"): " + subList.indexOf("B")); // 서브리스트에서 "B" 위치 확인
        System.out.println(list);

        // TODO#4. 서브리스트 조작: reverse, rotate, fill, clear
        // TODO#4-1. 요소를 역순으로 배치
        Collections.reverse(list.subList(3, 8));
        System.out.println("Collections.reverse(list.subList(3,8)): " + list);

        // TODO#4-2. 요소를 우측으로 2회 회전
        Collections.rotate(list.subList(3, 8), 2);
        System.out.println("Collections.rotate(list.subList(3,8), 2): " + list);

        // TODO#4-3. 서브리스트의 모든 요소를 "X"로 채움
        Collections.fill(list.subList(3, 8), "X");
        System.out.println("Collections.fill(list.subList(3,8), \"X\"): " + list);

        // TODO#4-4. 서브리스트 요소를 모두 제거
        list.subList(3, 8).clear();
        System.out.println(list); // 원본 리스트에서 서브리스트가 사라짐
    }
}
