package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        //declare a Queue
        Queue queue = new LinkedList();
        //initialize the Queue
        queue.add("Ahmed");
        queue.add("Ansar");
        queue.add("Imam");
        queue.add("Meraj");
        queue.add("Zaman");

        System.out.println("Elements in Queue:"+queue);

        System.out.println("Removed element: "+queue.remove());

        System.out.println("Head: "+queue.element());

        System.out.println("poll(): "+queue.poll());

        System.out.println("peek(): "+queue.peek());

        System.out.println("Elements in Queue:"+queue);

        // System.out.println("Element removed from the queue: "+queue.remove());
       // System.out.println("Queue's head: " + queue.peek());
      //  System.out.println("poll(): "+queue.poll());
        //traverse the Queue using Iterator
        System.out.println("The Queue elements through iterator:");
        Iterator iterator = queue.iterator();
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.print(element + " ");
        }
        System.out.println("\n\nThe Queue elements using for loop:");
        //use new for loop to traverse the Queue
        for(Object object : queue) {
            String element = (String) object;
            System.out.print(element + " ");
        }

    }

}
