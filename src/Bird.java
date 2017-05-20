/**
 * Created by melodytempleton on 5/20/17.
 */
public class Bird extends animal{


    public Bird(int age, int weight, String gender) {
       super(age, weight, gender);
    }

    @Override
    void move() {
        System.out.println("wings flapping");
    }

}
