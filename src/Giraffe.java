public class Giraffe extends Animal {

    public Giraffe(String name){
        super(name, "leaves");
    }

    public void eat(String food) {
        if(food.equals(this.getFavoriteFood())){
            super.eat(food);
            sleep();
        }else{
            System.out.println("YUCK!!! "+this.getName()+" will not eat "+food);
        }
    }
}
