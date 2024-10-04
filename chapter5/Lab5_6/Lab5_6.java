public class Lab5_6 {
    public static void main(String[] args) {
        ArrayQueue AQueue1 = new ArrayQueue(5);
        LinkedQueue LQueue1 = new LinkedQueue();

        long sAQtime1 = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            AQueue1.enqueue(i);
        }
        for(int i=0;i<100000;i++){
            AQueue1.dequeue();
        }
        long eAQtime1 = System.currentTimeMillis();
        long AQtime1 = (eAQtime1 - sAQtime1);
        System.out.println(AQtime1);
        
        long sLQtime1 = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            LQueue1.enqueue(i);
        }
        for(int i=0;i<100000;i++){
            LQueue1.dequeue();
        }
        long eLQtime1 = System.currentTimeMillis();
        long LQtime1 = (eLQtime1 - sLQtime1);
        System.out.println(LQtime1);

        ArrayQueue AQueue2 = new ArrayQueue(5);
        LinkedQueue LQueue2 = new LinkedQueue();

        long sAQtime2 = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            AQueue2.enqueue(i);
            AQueue2.dequeue();
        }
        long eAQtime2 = System.currentTimeMillis();
        long AQtime2 = eAQtime2 - sAQtime2;
        System.out.println(AQtime2);

        long sLQtime2 = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            LQueue2.enqueue(i);
            LQueue2.dequeue();
        }
        long eLQtime2 = System.currentTimeMillis();
        long LQtime2 = eLQtime2 - sLQtime2;
        System.out.println(LQtime2);
    }
}
