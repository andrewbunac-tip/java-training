package activities.activity05;

public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, int age, double salary, double hoursWorked, double hourlyRate) {
        super(name, age, salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

}
