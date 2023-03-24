package lessons.lesson03.oop_04_abstraction.example5_abstract_class;

public class Cat extends Animal implements Climb{

    public Cat(String catName) {
        super(catName);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Eat Fish");
    }

    @Override
    public void climbTree() {
        System.out.println("Cat Climb Tree");
    }
}
