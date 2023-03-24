package lessons.lesson03.oop_04_abstraction.example5_abstract_class;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("Neo");
        dog.eat();
        dog.makeSound();


        Animal cat = new Cat("Kia");
        cat.eat();
        cat.makeSound();

        Climb climb = (Cat)cat;

        climb.climbTree();


        SampleClass sampleClass = new SampleClass();

    }

}
