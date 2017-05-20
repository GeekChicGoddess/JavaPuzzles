/**
 * Created by melodytempleton on 5/20/17.
 */
public class SingingBirds {

    /**
     The birds in Florida like to sing during favorable temperatures.
     In particular, they sing if the temperature is between 60 and 90 (inclusive).
     Unless it is summer, then the upper limit is 100 instead of 90.
     Given an int temperature and a boolean isSummer,
     return true if the birds are singing and false otherwise. <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     birdsSinging(70, false)   <b>---></b> true <br>
     birdsSinging(95, false)    <b>---></b> false <br>
     birdsSinging(95, true) <b>---></b> true <br>
     */
    public static boolean birdsSinging(int temp, boolean isSummer) {

        if (isSummer == true && (temp >= 60 && temp <= 100)){
            return true;
        }
        else if (temp >= 60 && temp <= 90){
            return true;
        }

        else {
            return false;
        }
    }









    public static void main(String args[]){
        System.out.println(birdsSinging(75, false));
        System.out.println(birdsSinging(95 ,false));
        System.out.println(birdsSinging(50, true));
        System.out.println(birdsSinging(95, true));
    }
}
