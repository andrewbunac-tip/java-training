package lessons.lesson03.oop_04_abstraction.example04;

public class CSVParser implements Parser{

    public void openFile() {
        //code here
    }
    public void getFileContents() {
        // code here, read files
    }

    public void checkFormatContent()  {
        // check formats
    }
    public void startActualParsing()  {
        // check formats
    }

    @Override
    public String parseData(String fileLocation) {
        openFile();
        getFileContents();
        checkFormatContent();
        startActualParsing();
        return "CSV Parse";
    }
}
