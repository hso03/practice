
import java.util.ArrayList;
import java.util.List;

class ch3_11{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        //add(E element) => 특정요소 추가
        System.out.println(fruits.toString());
        System.out.println(fruits.get(1));
        fruits.add(1,"pin");
        System.out.println(fruits.toString());
        fruits.add(3,"pinapple");
        System.out.println(fruits.toString());
    }
}