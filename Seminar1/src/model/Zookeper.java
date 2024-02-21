package model;

public class Zookeper {
    private String name;
    private String food;

    public Zookeper(String name) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void feedAnimal(Animal animal, String food) {
        animal.eat(food);
    }

}
