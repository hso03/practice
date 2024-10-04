import java.util.Arrays;

public class Laab1_8 {
    public static void main(String[] args) {
        // TODO#1. 정수 5개를 갖는 배열 a 생성
        int[] a = {1,2,3,4,5};

        // TODO#2. Arrays.copyOf()를 이용해 요소 3개를 갖도록 복제하여 배열 b 생성
        int[] b = Arrays.copyOf(a, 3);

        // TODO#3. Arrays.copyOf()를 이용해 요소 7개를 갖도록 복제하여 배열 c 생성
        int[] c = Arrays.copyOf(a, 7);

        // TODO#4. 모든 배열을 출력
        System.out.println("배열 a: " + Arrays.toString(a));
        System.out.println("배열 b (요소 3개): " + Arrays.toString(b));
        System.out.println("배열 c (요소 7개): " + Arrays.toString(c));
    }
}
