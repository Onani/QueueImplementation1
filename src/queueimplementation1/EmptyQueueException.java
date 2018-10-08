package queueimplementation1;

// CCT College Dublin
// Dr. Muhammad Iqbal

import java.lang.Exception;

public class EmptyQueueException extends RuntimeException { 
      public EmptyQueueException() { super(); } 
      public EmptyQueueException(String msg) { super(msg); } 
    }