import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        
        //enqueue = offer()
        //queue = poll()
        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue);
        System.out.println(queue.size());
        //queue.poll();
        //queue.poll();
        //queue.poll();
        //queue.poll();


    }
    
}
