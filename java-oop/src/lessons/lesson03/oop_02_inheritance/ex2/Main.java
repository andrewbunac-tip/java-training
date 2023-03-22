package lessons.lesson03.oop_02_inheritance.ex2;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();
        Shape shape = new Shape();
        shape.name = "anyShape";
        Star star = new Star();


        triangle.introduce();
        circle.introduce();
        square.introduce();
        shape.introduce();
        star.introduce();
        star.introduce("Manila");




    }

}
