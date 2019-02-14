public class Unicorn extends Animal {

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep() {
        System.out.println(this.getName()+" sleeps in a cloud");
    }

    public void eat(String food) {
        if(food.equals(this.getFavoriteFood())){
            super.eat(food);
            sleep();
        }else{
            System.out.println(this.getName()+" eats "+food);
            sleep();
        }
    }

}
