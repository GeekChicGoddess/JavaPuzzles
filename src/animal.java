/**
 * Created by melodytempleton on 5/20/17.
 */
public abstract class animal {

    int age;
    String gender;
    int weight;



    void eat(){

        System.out.println("eating");

    }

    void sleep (){
        System.out.println("Sleeping");
    }

    public animal(int age, int weight, String gender) {
            this.gender=gender;
            this.age = age;
            this.weight = weight;
    }

    abstract void move();
}
