package lessons.lesson03.oop_04_abstraction.example5_abstract_class;

public class Dog extends Animal{

    public Dog(String dogName) {
        super(dogName);
    }

    @Override
    public void makeSound() {
        System.out.println("BArk");
    }

    @Override
    public void eat() {
        System.out.println("Eat Dog Food");
    }
}
