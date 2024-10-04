import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ch3_12{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        List<String> subList = Arrays.asList("Apple","Banana");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println(fruits.lastIndexOf("Banana")); // 마지막 인데스 반환
        System.out.println(fruits.indexOf("Banana")); // 요소의 인덱스를 반환 제일 앞에 있느걸로, 없으면 -1 반환
        System.out.println(fruits.contains("Apple")); // Apple가 포함 되어있는지
        System.out.println(fruits.containsAll(subList)); // containsAll은 리스트에 주어진 컬렉션의 모든 요소가 포함되어 있는지
               

    }
}