package lessons.lesson03.oop_04_abstraction.example05_abstract_class;

public class XMLFileFormatter extends AbstractFormatter{

    @Override
    protected String formatObject() {
        return
            "<Person>\n"
                +   "   <first_name>" +person.getFirstName() + "</first_name>\n"
                +   "   <last_name>" +person.getLastName() + "</first_name>\n"
                +   "   <gender>" +person.getGender() + "</gender>\n"
                +   "   <age>" +person.getAge() + "</gender>\n"
                +   "<person>";
    }
}
