import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ch3_14{
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "오렌지", "바나나");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("");

        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);    
        }
        System.out.println("");

        int index = 0;
        for (Iterator<String> iterator = fruits.iterator(); iterator.hasNext();) {
            String fruit = iterator.next();
        }
        System.out.println("");


        fruits.stream()
            .forEach(fruit -> System.out.println(fruit));

    }
}