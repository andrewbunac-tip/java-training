import object.Person;

public class Test {

    public static void main(String[] args) {
        Person person;
        person = new Person("Andrew", 31, "M", true);
        person.keepSecret("My Password is ABCD");

        String yourSecret = person.getSecret();


    }

}
