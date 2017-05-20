/**
 * Created by melodytempleton on 5/20/17.
 */
public class Chicken extends Bird implements flyable {

    public Chicken (int age, int weight, String gender){
        super(age, weight, gender);
    }

    public void canFly(){
        System.out.println("cannot fly");
    }


}
