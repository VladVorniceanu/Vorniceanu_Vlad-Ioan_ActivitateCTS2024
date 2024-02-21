package model;

public class Zebra extends Animal{
    public Zebra(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("The model.Zebra " + this.getName() + " eats " + food);
    }
}
