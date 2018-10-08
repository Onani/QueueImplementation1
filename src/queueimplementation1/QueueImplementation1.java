package queueimplementation1;

// CCT College Dublin
// Dr. Muhammad Iqbal

public class QueueImplementation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueInterface DemoQueue = new Queue();
        System.out.println("Queue is empty is " + DemoQueue.isEmpty());
        DemoQueue.enqueue("First Element");
        DemoQueue.enqueue("Second Element");  
        DemoQueue.enqueue("Third Element");
        DemoQueue.enqueue("Fourth Element");
        System.out.println("Queue is empty is " + DemoQueue.isEmpty());
        System.out.println("Queue elememtns are \n ");
        DemoQueue.QueueElements();

        DemoQueue.dequeue();
         System.out.println("Size of Queue is " + DemoQueue.size());
        //DemoQueue.QueueElements();
        System.out.println("Peek/top of Queue is " + DemoQueue.firstElement());
    }
    
}
