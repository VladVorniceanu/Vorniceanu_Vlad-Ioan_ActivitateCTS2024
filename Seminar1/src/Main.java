import model.*;

public class Main {
    public enum FeedingType{
        OMNIVOR,
        ERBIVOR,
        CARNIVOR;
    }
    public static void main(String[] args) {
        Zookeper zookeper = new Zookeper("Ion");
        Zoo zoo = new Zoo("Zoo",zookeper, null);

        Animal newAnimal = new Zebra("Marty", 21);
        zoo.addAnimal(newAnimal, "grass");

        Animal anotherAnimal = new Lion("Simba", 50);
        zoo.addAnimal(anotherAnimal, "zebras");
        zoo.addAnimal(new Pisica("Tom", 2), "ton");

        zoo.feedAllAnimals();

        FeedingType feedingType = FeedingType.CARNIVOR;
    }
}