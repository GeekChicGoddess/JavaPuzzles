/**
 * Created by melodytempleton on 5/20/17.
 */
public class Fish extends animal {

    void swim() {
        System.out.println("I can swim!");
    }

    public Fish(int age, int weight, String gender) {
        super(age, weight, gender);
    }

    void move(){
        swim();
    }
}