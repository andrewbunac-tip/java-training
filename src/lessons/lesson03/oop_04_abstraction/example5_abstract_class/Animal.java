package lessons.lesson03.oop_04_abstraction.example5_abstract_class;

public abstract class Animal {
    private String animalName;
    public Animal(String animalName) {
        this.animalName = animalName;
    }
    public Animal(String animalName,String nickName) {
        this.animalName = animalName;
    }

    public abstract void makeSound();
    public abstract void eat();


}
