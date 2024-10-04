import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Lab3_3 {

    public static void main(String[] args) {
        // TODO#1. 초기 리스트 생성 및 출력
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"A","B","C","D");

        System.out.println("초기 리스트: " + list);

        // TODO#2. 첫 번째 ListIterator (it1)를 조작
        ListIterator<String> it1 = list.listIterator();
        while(it1.nextIndex()<3){
            it1.next();
        }
        it1.add("X");
        System.out.println("it1에서 'X' 추가 후: " + list);

        // TODO#3. 두 번째 ListIterator (it2)를 조작
        ListIterator<String> it2 = list.listIterator();
        while(it2.nextIndex()<2){
            it2.next();
        }
        it2.set("Y");
        System.out.println("it2에서 'B'를 'Y'로 변경 후: " + list);

        // TODO#4. 세 번째 ListIterator (it3)를 조작
        ListIterator<String> it3 = list.listIterator();
        while(it3.nextIndex()<4){
            it3.next();
        }
        System.out.println(it3.next());
        System.out.println("it3에서 4번 이동 후 위치: " + list);

        // TODO#5. it1의 역방향 이동 (previous() 3회)
        while(it1.previousIndex()>0){
            it1.previous();
        }
        System.out.println(it1.next());
        System.out.println("it1에서 역방향으로 3번 이동 후: " + list);
    }
}
