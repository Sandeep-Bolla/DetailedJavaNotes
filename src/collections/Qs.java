package collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
Java Queue interface extends Collection interface. Collection interface extends Iterable interface.
Some of the frequently used Queue implementation classes are LinkedList, PriorityQueue,
ArrayBlockingQueue, DelayQueue, LinkedBlockingQueue, PriorityBlockingQueue etc..
AbstractQueue provides a skeletal implementation of the Queue interface to reduce the effort in implementing Queue.
*/

public class Qs { //Queues are FIFO 
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

        //Methods that return error: add(),remove(),element() ->To add an element at the end, To remove the first element and to just return the first element respectively
        q1.add(1); q1.add(5);q1.add(3);
        //q1.add(7); this will give an IllegalStateException as its adding more than size
        try{
            q1.add(7);//if try catch is not used it throws an exception
        }
        catch(IllegalStateException e){
            System.out.println("Cant add more than size");
        }
        
        //Iteration
        for(Integer val:q1){
            System.out.println("Value is"+val);
        }

        System.out.println(q1.element()); //just returns the first element but does not remove
        System.out.println(q1.remove());  //removes the first element
        System.out.println(q1.remove());  //removes the first element
        System.out.println(q1.remove());  //removes the first element
        //System.out.println(q1.remove()); throws error -> to work we need to use try-catch as we did for add()

        q1.add(1);q1.add(3);q1.add(5);
        System.out.println(q1.remove(7));//returns false
        System.out.println(q1.remove(1));//removes the value and returns true
        System.out.println(q1.remove(3));//removes the value and returns true
        System.out.println(q1.remove(5));//removes the value and returns true
        System.out.println(q1.remove(6));//returns false
    }
}


class Qs2 { //Queues are FIFO 
    public static void main(String[] args) {
        Queue<Integer> q2 = new ArrayBlockingQueue<>(3);

        //Methods that return error: offer(),poll(),peek() ->To add, remove an item based on index and to return the first element respectively
        //but this time it does not throw any exception if the its oversizes while adding and if its empty while deleting, it just returns NULL
        q2.offer(1); q2.offer(5);q2.offer(3);
        q2.offer(7); //does not throw error
        
        //Iteration
        for(Integer val:q2){
            System.out.println("Value is"+val);
        }

        System.out.println(q2.peek()); //just returns the first element does not remove

        System.out.println(q2.poll()); //does not throw error if its empty queue-> returns null
    }
}

//For blockingQueue() interface there exists two more versions of these methods
/*similarly put(),take() ->these block the current thread indefinitely,
until the operation can succeed eg:until space becomes free fora adding operation*/
//The last versioin is a Timeout version
//Refer: https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/BlockingQueue.html