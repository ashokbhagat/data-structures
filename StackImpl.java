public class StackImpl {
    
    public static void main(String[] args) {
        Stack stack = new Stack(10);

        for (int i = 0; i < 11; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 11; i++) {
            stack.pop();
        }

    }
}


class Stack {
    private int top;
    private int []arr;
    private int limit;

    public Stack(int size){
        top = -1;
        limit = size-1;
        arr = new int[size];
    }

    public void push(int value){
        if(top < limit){
            top++;
            arr[top] = value;
            System.out.println(value +" Value inserted successfully");
        }else{
            System.out.println("ERROR :  stack is full");
        }
    }

    public int pop(){
        int value;
        if(top < 0){
            System.out.println("ERROR :  stack is empty");
            throw new RuntimeException("stack is empty");
        }else{
            value =  arr[top--];
            System.out.println(value+" Popped successfully !!!");
            return value;
        }
    }



}
