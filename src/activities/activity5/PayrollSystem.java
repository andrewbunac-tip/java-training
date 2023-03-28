package activities.activity5;

public class PayrollSystem {
    public static void main(String[] args) {
        HourlyEmployee h = new HourlyEmployee("John Smith", 35, 0, 40, 20);
        SalariedEmployee s = new SalariedEmployee("Jane Doe", 28, 60000);

        System.out.println(h.getName() + " earned $" + h.calculatePay() + " this week.");
        System.out.println(s.getName() + " earned $" + s.calculatePay() + " this month.");
    }

}
