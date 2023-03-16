public class UnderstandingObjects {

    public static void main(String[] args) {
        // Creation of Object
        Person person = new Person();
        person.name = "Andrew";
        person.age = 30;
        person.gender = "Male";

        // re instantiation of object, considered as 2nd object
        person = new Person();
        person.name = "Ed";
        person.age = 30;
        person.gender = "Male";

        // Execution of behavior
        person.sayHi();
        person.walk();

        // Creation of 3rd object and assigned it to person2
        Person person2 = new Person();
        person2.name = "Andrew";
        person2.age = 30;
        person2.gender = "Male";

        // Execution of behavior
        person2.sayHi();
        person2.walk();
    }

}
