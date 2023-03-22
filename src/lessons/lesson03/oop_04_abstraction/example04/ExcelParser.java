package lessons.lesson03.oop_04_abstraction.example04;

public class ExcelParser implements Parser, MathProblemSolver {

    private void openFile(){

    }
    private void  checkIfFileFormatIsExcel() {

    }
    private void checkExcelVersion() {

    }
    private void checkWorkBookName() {

    }
    private void readCells() {

    }

    private void getTotalRecords() {

    }

    @Override
    public String parseData(String fileLocation) {
        openFile();
        checkIfFileFormatIsExcel();
        checkExcelVersion();
        checkWorkBookName();
        readCells();
        return null;
    }



    @Override
    public void getSumOfRecords(String Path) {
        openFile();
        checkIfFileFormatIsExcel();
        checkExcelVersion();
        checkWorkBookName();
        readCells();
        getTotalRecords();
    }
}
