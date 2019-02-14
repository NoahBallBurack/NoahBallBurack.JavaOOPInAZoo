public class Bee extends Animal{

    public Bee(String name){
        super(name, "pollen");
    }

    public void sleep(){
        System.out.println(this.getName()+" never sleeps");
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
