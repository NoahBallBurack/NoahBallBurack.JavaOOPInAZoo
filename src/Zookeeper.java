public class Zookeeper {
    private String name;
    public Zookeeper(String name){
        this.name=name;
    }

    public void feedAnimals(String food){
        System.out.println(this.name+" is feeding "+food+" to "+Animal.animalsArray.size()+" of "+Animal.population+" total animals");
        for(int i=0;i<Animal.animalsArray.size();i++){
            Animal.animalsArray.get(i).eat(food);
        }
    }
}
