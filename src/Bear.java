public class Bear extends Animal{

    public Bear(String name) {
        super(name, "fish");

    }

    public void sleep() {
        System.out.println(this.getName()+" hibernates for 4 months");
    }

}
