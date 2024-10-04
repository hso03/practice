
public class Laab2_1 {
    // TODO#1. 배열에 요소를 삽입하기 위한 메서드
    public static void insert(int[] a, int length, int x) {
        // 배열의 마지막에서부터 요소를 이동시켜 새로운 요소를 삽입할 공간 확보
        int i;
        for (i = length - 1; (i >= 0 && a[i] > x); i--) {
            System.arraycopy(a, i, a, i+1, 1);
        }
        a[i+1]=x;
    }

    // TODO#2. 배열 출력을 위한 메서드
    public static String toString(int[] a, int length) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        // 배열의 첫 번째 요소 출력
        if (length > 0) {
            builder.append(a[0]+", ");
        }

        // 나머지 요소 출력
        for (int i = 1; i < length; i++) {
            builder.append(a[i]+", ");
        }

        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        // 배열 크기를 미리 정의 (정렬된 배열에 추가할 수 있는 공간이 필요)
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        int length = 5; // 현재 배열에 채워져 있는 요소 수

        System.out.println("삽입 전 배열: " + toString(array, length));

        // 새로운 요소 25를 삽입
        insert(array, length, 25);
        length++; // 배열의 크기 증가
        System.out.println("삽입 후 배열: " + toString(array, length));

        // 새로운 요소 5를 삽입
        insert(array, length, 5);
        length++;
        System.out.println("삽입 후 배열: " + toString(array, length));

        // 새로운 요소 60을 삽입
        insert(array, length, 60);
        length++;
        System.out.println("삽입 후 배열: " + toString(array, length));
    }
}
