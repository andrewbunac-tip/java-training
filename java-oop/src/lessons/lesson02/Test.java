package lessons.lesson02;

import lessons.lesson02.example02.Person;

public class Test {

    public static void main(String[] args) {
        Person person;
        person = new Person("Andrew", 31, "M", true);
        person.keepSecret("My Password is ABCD");

        String yourSecret = person.getSecret();


    }

}
