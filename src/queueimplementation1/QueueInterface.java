package queueimplementation1;

// CCT College Dublin
// Dr. Muhammad Iqbal

public interface QueueInterface <E> {
    public int size();
    public boolean isEmpty();
    public E firstElement();
    public void enqueue(E item);
    public E dequeue();
    public void QueueElements();    
        
}
