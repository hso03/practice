import java.util.Arrays;

public class Laab1_2 {
    public static void main(String[] args) {
        // TODO#1. 배열 a를 선언하고 1에서 9까지의 정수로 초기화
        int[] a = {1,2,3,4,5,6,7,8,9};

        boolean[] b = new boolean[a.length];
        // TODO#2. 배열 a의 각 요소가 홀수인지 확인하여 boolean 타입의 배열 b에 저장
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){b[i]=true;}
        }

        double[] c = new double[a.length];
        // TODO#3. 배열 a의 각 요소를 반지름으로 하는 원의 면적을 계산하여 배열 c에 저장
        for(int i=0;i<a.length;i++){
            c[i]=a[i]*a[i]*Math.PI;
        }

        System.out.println("배열 a: " + Arrays.toString(a));
        System.out.println("배열 b (홀수 여부): " + Arrays.toString(b));
        System.out.println("배열 c (원의 면적): " + Arrays.toString(c));
    }
}
