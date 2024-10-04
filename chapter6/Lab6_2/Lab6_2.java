public class Lab6_2 {
    public static void main(String[] args) {
        SimpleHashMap<String, Integer> map = new SimpleHashMap<>();
    
        // 키-값 쌍을 맵에 추가
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.put("date", 4);
    
        // 키 "banana"의 값을 업데이트
        map.put("banana", 5);
    
        // 맵의 엔트리들을 출력
        System.out.println("SimpleHashMap의 엔트리 집합:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
    
}
