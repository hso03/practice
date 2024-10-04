
import java.util.Arrays;


public class Laab1_1 {
    public static void main(String[] args) {
        // TODO#1. float 타입을 갖는 배열 x 선언
        // TODO#2. 선언된 배열 x에 크기 10의 배열 할당
        float[] x = new float[10];

        
        // TODO#3. main 함수의 입력 파라메터 args에 크기 10 배열 할당
        args = new String[10];
        
        // TODO#4. boolean 타입 배열 isPrime을 선언하고, 크기 5 배열 할당
        boolean[] isPrime = new boolean[5];

        // TODO#5. int 타입 배열 fib1을 선언하고, new int[]를 사용하지 않고 0부터 시작하는 피보나치 수열 10개를 초기값으로 설정
        int[] fib1 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        // TODO#6. int 타입 배열 fib2를 선언하고, new int[]와 함께 0부터 시작하는 피보나치 수열 10개를 초기값으로 설정
        int[] fib2 = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        // TODO#7. double 타입의 2차원 배열 a를 선언하고, 다음 값으로 초기화
        double[][] a = new double[][]{ { 1.1, 2.2 }, { 3.3, 4.4 }, null, { 5.5, 6.6 }, null };

        // TODO#8. short 타입의 2차원 배열 b를 선언하고, 4x10 배열로 할당
        short[][] b = new short[4][10];

        // TODO#9. Object 타입 배열 objects를 선언하고, 앞에서 생성한 x, args, isPrime, fib1, b, a로 초기화
        Object[] objects = {x , args , isPrime, fib1, fib2, a, b};

        // TODO#10. Integer 타입 배열 ints를 선언하고, 요소가 없는 배열로 초기화
        Integer[] ints = null;

        // TODO#11. 앞에서 정의된 배열을 출력
        // for(int i=0;i<objects.length;i++){
        //     System.out.println(Arrays.deepToString(objects[i]));
        // }

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(args));
        System.out.println(Arrays.toString(isPrime));
        System.out.println(Arrays.toString(fib1));
        System.out.println(Arrays.toString(fib2));
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(objects));
        
        // System.out.println(Arrays.toString(b[0]));



        // TODO#12. 배열 objects가 Object[] 타입인지 확인
        System.out.println(objects instanceof Object[]);

        // TODO#13. 배열 objects의 0번째 요소가 Object 타입인지 확인
        System.out.println(objects[0] instanceof Object);

        // TODO#14. 배열 objects의 0번째 요소가 float[] 타입인지 확인
        System.out.println(objects[0] instanceof float[]);

        // TODO#15. 배열 b의 0번째 요소가 short[] 타입인지 확인
        System.out.println(b[0] instanceof short[]);

        // TODO#16. 배열 ints가 Object 타입인지 확인
        System.out.println(ints instanceof Object);

        // TODO#17. 배열 ints가 Object[] 타입인지 확인
        System.out.println(ints instanceof Object[]);
    }
}
