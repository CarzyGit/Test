import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wlkq
 * @date 2022-07-15 13:16
 */
public class Test3 {



        public static void main(String[] args) {
            Queue<String> queue = new LinkedList<>();
            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("E");

            while (queue.size() > 0) {
                String poll = queue.poll();
                System.out.println(poll);


            }
        }

    }

