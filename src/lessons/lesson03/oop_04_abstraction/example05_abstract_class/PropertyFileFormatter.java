package lessons.lesson03.oop_04_abstraction.example05_abstract_class;

public class PropertyFileFormatter extends AbstractFormatter{

    @Override
    protected String formatObject() {
        return
            "first_name  : " + person.getFirstName() + "\n"
                +  "last_name   : " +person.getLastName() + "\n"
                +  "gender      : " +person.getGender() + "\n"
                +  "age         : " +person.getAge();
    }
}
