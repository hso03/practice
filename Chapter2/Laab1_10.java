import java.util.Arrays;



public class Laab1_10 {
    public static void main(String[] args) {
        // TODO#2. 정수 1~10까지 10개를 순서대로 각각의 Box에 담아 배열을 생성
        Box[] boxes = new Box[10];
        for(int i=0;i<boxes.length;i++){
            boxes[i]=new Box(i+1);
        }

        // TODO#3. Box 배열의 3번째부터 5번째까지의 요소를 copyOfRange()를 이용해 복제 후 출력
        Box[] copiedBoxes = Arrays.copyOfRange(boxes, 2, 5);
        System.out.println("복제된 배열: " + Arrays.toString(copiedBoxes));

        // TODO#4. 복제된 배열의 요소를 up() 시킴
        for (Box box : copiedBoxes) {
            box.up();   
        }

        // TODO#5. 원본 배열과 복제 후 증가시킨 배열을 출력
        System.out.println("원본 배열: " + Arrays.toString(boxes));
        System.out.println("복제 후 증가시킨 배열: " + Arrays.toString(copiedBoxes));
    }
}



// TODO#1. 정수를 가질 수 있는 Box 클래스를 정의
class Box {
    private int value;

    // Box 생성자
    public Box(int value) {
        this.value = value;
    }

    // value 값을 증가시키는 up() 메서드
    public void up() {
        value++;
    }

    // 현재 값을 출력하는 toString 메서드
    @Override
    public String toString() {
        return Integer.toString(value);
    }
}