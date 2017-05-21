package ds;

/**
 * Created by melodytempleton on 5/20/17.
 */
public class queue {

    private int maxSize;
    private int front;
    private int rear;
    private long[] queueArray;
    private int nitems;


    public queue(int size){
        this.maxSize = size;
        this.queueArray = new long[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nitems =0;
    }

    public void insert(long j){
        if (rear==maxSize-1){
            rear=-1;
        }
        rear++;
        queueArray[rear] = j;
        nitems++;
    }

    public long remove(){

    long temp =  queueArray[front];

    if (front==maxSize){
        front = 0;
    }
        nitems--;
    return temp;
    }

    public void peekFront(){
        System.out.println(queueArray[front]);
    }

    public boolean isEmpty(){
        return (nitems==0);
    }

    public boolean isFull(){
       return  (nitems==maxSize);
    }

    public void view(){

        System.out.print("[");
        for (int i=0; i < queueArray.length; i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("]");
    }


}
