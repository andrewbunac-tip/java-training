package lessons.lesson03.oop_04_abstraction.example04;

public class Main {

    public static void main(String[] args) {
        Parser parser = new CSVParser();
        parser.parseData("C:/document/records.csv");

        parser.parseData("C:/document/records.xls");
        Parser excelParse = new ExcelParser();


        MathProblemSolver solver = new ExcelParser();
        solver.getSumOfRecords("C:/document/records.xls");
    }

}
