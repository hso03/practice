import java.util.*;

class Lab6_1 {
    static Random random = new Random();

    public static int hash(String key, int size) {
        int sum=0;
        int res=size;
        for(int i=0;i<key.length();i++){
            sum = sum*2 + (int)key.charAt(i);
            // sum +=(int) key.charAt(i);
        }
        for(int i=0;i<size;i++){
            if(sum%size==i){
                res=i;
                System.out.println("SUM : "+sum+"   //   I : "+i+"   //   RES : "+res);
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        // 해시 테이블의 크기 (임의로 17으로 설정)
        int size = 17;
        int[] hits = new int[size];

        // 랜덤 문자열 생성 및 테스트
        for (int i = 0; i < 100; i++) {
            // 1~10글자의 랜덤 문자열 생성
            String randomString = generateRandomString(1 + random.nextInt(10));
            int hashCode = hash(randomString, size);
            hits[hashCode]++;
            System.out.println("문자열: " + randomString + ", 해시 코드: " + hashCode);
        }

        System.out.println("hits : " + Arrays.toString(hits));
    }

    // 랜덤 문자열 생성 함수
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }
        return randomString.toString();
    }
}
