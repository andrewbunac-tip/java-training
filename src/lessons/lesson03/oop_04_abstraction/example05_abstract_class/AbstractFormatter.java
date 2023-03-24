package lessons.lesson03.oop_04_abstraction.example05_abstract_class;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract  class AbstractFormatter {

    private String absolutePath;
    protected String formattedData;

    protected Person person;

    String formatObject(Person person) {
        this.person = person;
        this.formattedData = this.formatObject();
        return  this.formattedData;
    }


    protected abstract String formatObject();

    public void saveToFile() {
        // Creating an instance of file
        Path path = Paths.get(absolutePath);

        // Custom string as an input


        // Try block to check for exceptions
        try {
            // Now calling Files.writeString() method
            // with path , content & standard charsets
            Files.writeString(path, formattedData,
                StandardCharsets.UTF_8);
        }
        // Catch block to handle the exception
        catch (IOException ex) {
            // Print messqage exception occurred as
            // invalid. directory local path is passed
            System.out.print("Invalid Path");
        }
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public String getFormattedData() {
        return formattedData;
    }

}
