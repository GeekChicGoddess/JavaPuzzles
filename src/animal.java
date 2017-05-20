/**
 * Created by melodytempleton on 5/20/17.
 */
public class animal {

    void eat(String food){

        System.out.println("I eat " + food);

    }

    void sleep (String dayOrNight){
        System.out.println("I sleep during the " + dayOrNight);
    }

    public animal(String food, String dayOrNight) {
            sleep(dayOrNight);
            eat(food);
    }
}
