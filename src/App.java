/**
 * Created by melodytempleton on 5/20/17.
 */
public class App {


    public static void main(String[] args) {

//        Stack theStack = new Stack(5);
        System.out.println(reverseString("Hello"));


    }


    public static String reverseString(String str){
       int stackSize = str.length();
       Stack newStack = new Stack(stackSize);
       for(int i=0; i<str.length(); i++ ){
          char ch = str.charAt(i);
          newStack.push(ch);
       }

       String result = "";

       while(!newStack.isEmpty()){
           result += newStack.pop();
       }
        return result;
    }
}
