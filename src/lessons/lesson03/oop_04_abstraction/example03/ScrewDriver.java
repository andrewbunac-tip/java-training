package lessons.lesson03.oop_04_abstraction.example03;

public class ScrewDriver implements Tools{

    public String screwName;

    @Override
    public void operateTools() {
        System.out.println("Rotate Screw Driver");
    }
}
