package queueimplementation1;

// CCT College Dublin
// Dr. Muhammad Iqbal

import java.util.ArrayList;

/**
 *
 * @author munaw
 */
public class Queue <E> implements QueueInterface<E> {
    
  private ArrayList<E> QueueList;
 
	public Queue() {
 		QueueList = new ArrayList<E>();
 	}
 
	public void enqueue(E item) {
 		QueueList.add(item);
 	}
 
	public E dequeue() {
 		if (!isEmpty())
 		    return QueueList.remove(0);
 		else
 		    throw new EmptyQueueException();
 	}
 
	public boolean isEmpty() {
 		return (QueueList.size() == 0);
 	}
	
	public E firstElement() {
 		if (!isEmpty())
 		    return QueueList.get(0);
 		else
 		    throw new EmptyQueueException();
 	}
 
	public int size() {
 		return QueueList.size();
 	}
 
	
	public void QueueElements() {
               
                for (int i = 0; i < QueueList.size(); i++)
                    System.out.println("QueueList[" + i + "] = " + QueueList.get(i));   

 	}  
}
