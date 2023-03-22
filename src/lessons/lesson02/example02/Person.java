package lessons.lesson02.example02;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String secret;

    private boolean allowSecret;

    public Person() {
        this.allowSecret = true;
    }

    public Person(String name, int age, String gender, boolean allowSecret) {
        this.allowSecret = allowSecret;

        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void introduce() {
        System.out.println("Hi my name is " + name + ", " + age  + "year/s old");
    }


    // Assessor (Getters)
    public String getName() {
        return this.name;
    }


    public String getSecret() {
        if(shouldIRevealMySecret()) {
            return this.secret;
        }
        return null;
    }

    private boolean shouldIRevealMySecret(){
        //conitions
        return false;
    }

    public void keepSecret(String secret) {
        this.secret = secret;
    }

}
