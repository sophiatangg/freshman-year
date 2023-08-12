
//import java.util.LinkedList;
//import java.util.Queue;


public class Queue<E>{
    private Node<E> front;
    private Node<E> rear;
    private int size = 0;

    private static class Node<E>{
        private final E data;
        private Node<E> nextnode ;
        public Node (E data){
            this.data = data;
            

        }
    }

    public void enqueue(E data){
        Node<E> newNode = new Node<E>(data);
        if (size ==0){
            
            front = newNode;
            rear = newNode;
        
        
        }else{
            rear.nextnode = newNode;
            rear = newNode;
        }
        size++;

    }

    public E dequeue(){
        if (size>0 ){
            E frontreturn  = front.data;
            front = front.nextnode;
            size--;
            return frontreturn;


        }else{
            return null;
        }
    }

    public boolean isEmpty(){
        // if (size == 0){
        //     return true;
        // }else if (size >0){
        //     return false;}
        
        // }
        if (size == 0){
            return true;
        }else {
            return false;
        }
    }

    public E peek(){
        if (front != null ){
            E frontreturn  = front.data;
  
            return frontreturn;

        }else{
            return null;
        }
    }

    int getSize(){
        return size;
    }

    void QueuetoStirng(){
         Queue<E> queuestring = new Queue<E>();
         while (queuestring.isEmpty() == false){
            E object = queuestring.dequeue();
            System.out.println(object);
         }
        }

    // void printQ(){
    //     for (int i = 0; i<size;i++){
    //         System.out.println(Queue.get(i));
    //     }
    // }
    
    

    public static void main (String[] args){
    Queue<Integer> numberQueue = new Queue<Integer>();
        numberQueue.enqueue(1);
        numberQueue.enqueue(2);
        numberQueue.enqueue(3);
        numberQueue.enqueue(4);
        numberQueue.enqueue(5);
        numberQueue.enqueue(6);
        numberQueue.enqueue(7);
        //int num = numberQueue.dequeue();
 

        System.out.println(numberQueue.peek());

        

    }
}


