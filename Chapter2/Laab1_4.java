import java.util.Arrays;

public class Laab1_4 {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5 };

        // TODO#1. 인덱스를 이용하는 for문을 이용해 배열을 출력
        System.out.println("인덱스를 이용한 for문 출력:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        // TODO#2. 배열의 개별 요소를 순차적으로 가져와 처리하는 enhanced for문을 이용해 배열을 출력
        System.out.println("Enhanced for문 출력:");
        for (int value : a) {
            System.out.print(value + " ");
            // System.out.print(a[value]+" ");
        }
        System.out.println();

        // TODO#3. Stream의 forEach() 함수를 이용해 배열을 출력
        System.out.println("Stream의 forEach() 함수 출력:");
        Arrays.stream(a+"").forEach(System.out::print);
        System.out.println();
    }
}
