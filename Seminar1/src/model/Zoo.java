package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private String name;
    private Zookeper zookeper;
    private Map<Animal, String> animals;

    public Zoo(String name, Zookeper zookeper, Map<Animal, String> animals) {
        this.name = name;
        this.zookeper = zookeper;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zookeper getZookeper() {
        return zookeper;
    }

    public void setZookeper(Zookeper zookeper) {
        this.zookeper = zookeper;
    }


    public void feedAllAnimals() {
        for (var a : animals.entrySet()) {
            zookeper.feedAnimal(a.getKey(), a.getValue());
        }
    }

    public void addAnimal(Animal newAnimal, String animalFood ) {
        if(animals == null) {
            animals = new HashMap<>();
        }
        animals.put(newAnimal, animalFood);
    }
}
