public class Person {
    //ATT
    public String name;
    public int age;
    public String gender;

    //BEHAV
    public void sayHi(){
        System.out.println("Hi I am " + name);

    }
    public void walk(){
        System.out.println(name + " is walking");

    }

    public String returnMyName(){
        return name;
    }


}
