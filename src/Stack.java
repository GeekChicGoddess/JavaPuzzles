/**
 * Created by melodytempleton on 5/20/17.
 */
public class Stack {

    private int maxSize;
    private  char[] stackArray;
    private  int top;

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;

    }

    public void push(char j){
        if(isFull()){
            System.out.println("Sorry, array is full");
        }
        else {
            top++;
            stackArray[top] = j;
        }
    }


    public char pop(){
        if(isEmpty()){
            System.out.println("Array is empty");
            return 'x';
        }
        else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }
}
