package lessons.lesson03.oop_04_abstraction.ex1;

public class ToyotaVios extends Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving Toyota Vios");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Toyota Vios: Insert Key, twist");
    }
}
