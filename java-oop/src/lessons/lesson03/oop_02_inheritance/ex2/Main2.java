package lessons.lesson03.oop_02_inheritance.ex2;

public class Main2 {

    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.introduce();
        shape = new Square();
        shape.introduce();
        shape = new Circle();
        shape.introduce();

        shape = new Star();
        shape.introduce();

    }

}
