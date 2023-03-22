package d5.inheritance.ex2;

public class Star extends Shape{

    public Star() {
        this.name = "Star";

    }

    @Override
    public void introduce() {
        System.out.println("Hey guys I am " + name);
    }


    public void introduce(String location) {
        System.out.println("Hello " + location + "I am " + name);
    }
}
