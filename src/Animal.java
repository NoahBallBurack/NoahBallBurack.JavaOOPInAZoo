import java.util.ArrayList;

public class Animal {

    private String name;
    private String favoriteFood;

    public static ArrayList<Animal> animalsArray = new ArrayList<Animal>();

    static int population;

    public Animal(String name, String favoriteFood) {
        this.name=name;
        this.favoriteFood=favoriteFood;
        animalsArray.add(this);
        population++;
    }

    public void sleep() {
        System.out.println(this.name+" sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name+" eats "+food);
        if(food.equals(this.favoriteFood)){
            System.out.println("Yum!!! "+this.name+" wants more "+food);
        }else{
            sleep();
        }
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getName() {
        return name;
    }
}