

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
public class QueueTests {
    Queue<Integer> numberQueue = new Queue<Integer>();
    Queue<Integer> EmptyQueue = new Queue<Integer>();

    @Test
    public void constructortest(){
        Queue<Integer> numQueue =new Queue<Integer>();
        assertNotNull(numQueue);
    }

    // @Test
    // public void useGenerics(){
    //     Queue<String>  strQ = new Queue<String>();
    //     Queue<Integer>  strI = new Queue<Integer>();
    //     assertEquals(strI<E>,Integer);
    // }
     @Test
        public void QueueEnqueue(){
        assertEquals(numberQueue.getSize(),0);
        numberQueue.enqueue(1);
        numberQueue.enqueue(2);
        numberQueue.enqueue(3);
        numberQueue.enqueue(4);
        numberQueue.enqueue(5);
        numberQueue.enqueue(6);
        numberQueue.enqueue(7);
        assertEquals(numberQueue.getSize(),7);

        
     }

    @Test
    public void QueuePeek(){
        numberQueue.enqueue(1);
        numberQueue.enqueue(2);
        numberQueue.enqueue(3);
        numberQueue.enqueue(4);
        numberQueue.enqueue(5);
        numberQueue.enqueue(6);
        numberQueue.enqueue(7);
        int p = numberQueue.peek();
        assertEquals(p,1);
        assertEquals(EmptyQueue.peek(),null);
    }


    @Test
    public void QueueisEmpty(){
        numberQueue.enqueue(1);
        numberQueue.enqueue(2);
        numberQueue.enqueue(3);
        numberQueue.enqueue(4);
        numberQueue.enqueue(5);
        numberQueue.enqueue(6);
        numberQueue.enqueue(7);
        boolean p = numberQueue.isEmpty();

        
        boolean q = EmptyQueue.isEmpty();
        
        assertEquals(p,false);
        assertEquals(q, true);
    }
    @Test
    public void Queuedequeue(){
        numberQueue.enqueue(1);
        numberQueue.enqueue(2);
        numberQueue.enqueue(3);
        numberQueue.enqueue(4);
        numberQueue.enqueue(5);
        numberQueue.enqueue(6);
        numberQueue.enqueue(7);
        Queue<Integer> EmptyQueue = new Queue<Integer>();

        int d  = numberQueue.dequeue();
        assertEquals(d,1);
        assertEquals(numberQueue.getSize(),6);
        assertEquals(EmptyQueue.dequeue(), null);

        
        
    }

        
        
        
        

     
    }
