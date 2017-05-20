/**
 * Created by melodytempleton on 5/20/17.
 */
public class App {


    public static void main(String[] args) {

        Stack theStack = new Stack(5);
        theStack.push('h');
        theStack.push('e');
        theStack.push('l');
        theStack.push('l');
        theStack.push('o');


        while(!theStack.isEmpty()){
            char value = theStack.pop();
            reverseString(value);
        }
        System.out.println(wordReversed);


    }

    public static String wordReversed = "";
    public static String reverseString(char character){
        wordReversed = wordReversed + character;
        return wordReversed;
    }
}
