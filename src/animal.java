/**
 * Created by melodytempleton on 5/20/17.
 */
public class animal {

    int age;
    String gender;
    int weight;



    void eat(String food){

        System.out.println("I eat " + food);

    }

    void sleep (String dayOrNight){
        System.out.println("I sleep during the " + dayOrNight);
    }

    public animal(String food, String dayOrNight, int age, int weight, String gender) {
            this.gender=gender;
            this.age = age;
            this.weight = weight;


            sleep(dayOrNight);
            eat(food);
    }
}
