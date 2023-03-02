public class QueueImpl {
public static void main(String[] args) {
    Queue queue = new Queue(11);

    for (int i = 1; i < 11; i++) {
        queue.enQueue(i);       
    }

    queue.print();

    queue.deQueue();
    queue.deQueue();

    queue.print();
}
}

class Queue {

    int size;
    int[] arr;
    int front = 0;
    int rear = 0;

    //constructor
    public Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    //insert into the queue
    public Boolean enQueue(int value){
        if(isFull()){
            System.out.println("Error : Queue is full !!!");
            return false;
        }else{
            arr[rear++] = value;
            System.out.println(value+" is inserted at rear position "+rear);
            return true;
        }
    }

    public Integer deQueue(){
        if(isEmpty()){
            System.out.println("Error : Queue is empty !!!");
            return null;
        }else{
            int value = arr[front++];
            System.out.println(value+" is deQueued from front position "+front);
            return value;
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("ERROR : Queue is empty !!!");
            return ;
        }
       for (int i = front; i < rear; i++) {
        System.out.println("value is "+arr[i]);
       }
    }

    public boolean isFull(){
        return rear == (size-1);
    }
    
    public boolean isEmpty(){
        return rear == front;
    }

}