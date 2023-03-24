package lessons.lesson03.oop_04_abstraction.example05_abstract_class;

public class Main {

    public static void main(String[] args) {
        AbstractFormatter pff = new PropertyFileFormatter();
        AbstractFormatter xff = new XMLFileFormatter();

        Person p = new Person();
        p.setFirstName("Andrew");
        p.setLastName("Bunac");
        p.setGender("M");
        p.setAge(31);

        String formatString = pff.formatObject(p);
        System.out.println(formatString);
        pff.setAbsolutePath("C:\\Users\\x229704\\Desktop\\java_Training\\java-training\\data.properties");
        pff.saveToFile();


        String xmlFormatString = xff.formatObject(p);
        System.out.println(xmlFormatString);
        xff.setAbsolutePath("C:\\Users\\x229704\\Desktop\\java_Training\\java-training\\dataxml.xml");
        xff.saveToFile();
    }
}
