/**
 * Created by melodytempleton on 5/20/17.
 */
public class Counter {

    private String name= null;
    private int currentNumber = 0;

    public Counter(String str){
        this.name=str;
    }

    public int increment(){

        return currentNumber++;

    }

   public int getCurrentValue(){

        return currentNumber;
    }

    public String myString(){
        return name +": " + currentNumber;
    }

}
