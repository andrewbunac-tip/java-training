package lessons.lesson02.example04;

public class LogBook {
    private String name;
    private String timeOfVisit;
    private String reasonOfVisit;

    public LogBook() {
    }

    public LogBook(String name, String timeOfVisit, String reasonOfVisit) {
        this.name = name;
        this.timeOfVisit = timeOfVisit;
        this.reasonOfVisit = reasonOfVisit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfVisit() {
        return timeOfVisit;
    }

    public void setTimeOfVisit(String timeOfVisit) {
        this.timeOfVisit = timeOfVisit;
    }

    public String getReasonOfVisit() {
        return reasonOfVisit;
    }

    public void setReasonOfVisit(String reasonOfVisit) {
        this.reasonOfVisit = reasonOfVisit;
    }


    public void showLog() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {


        return "LogBook{" +
            "name='" + name + '\'' +
            ", timeOfVisit='" + timeOfVisit + '\'' +
            ", reasonOfVisit='" + reasonOfVisit + '\'' +
            '}';
    }

}
