import java.util.Arrays;

public class Lab1_5 {
    public static void main(String[] args) {
        // 테스트를 위한 정수 배열을 생성
        int[] a = new int[] { 1, 2, 3, 4, 5 };

        // TODO#1. 인덱스를 이용하는 for문을 이용해 배열의 짝수 요소를 출력
        System.out.println("인덱스를 이용한 for문으로 짝수 요소 출력:");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        System.out.println();

        // TODO#2. 배열의 개별 요소를 순차적으로 가져와 처리하는 enhanced for문을 이용해 배열의 짝수 요소를 출력
        System.out.println("Enhanced for문으로 짝수 요소 출력:");
        for (int value : a) {
            if(value%2==0){
                System.out.println(value);
            }
        }
        System.out.println();

        // TODO#3. Stream의 forEach() 함수를 이용해 배열의 짝수 요소를 출력
        System.out.println("Stream의 forEach() 함수로 짝수 요소 출력:");
        Arrays.stream(a)
                .filter(x -> x % 2 == 0) // 짝수 필터링
                .forEach(System.out::println);
        System.out.println();
    }
}
