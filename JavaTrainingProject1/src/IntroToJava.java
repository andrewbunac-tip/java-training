import java.util.Scanner;

public class IntroToJava {
    private int name;

    public static void main(String[] args) {
        double[] taxableAmount = collectTaxableAmount();
        double sum = computeTotalAmount(taxableAmount);
        double mytaxFor2022 = computeTax2022(sum);
        double mytaxFor2023 = computeTax2023(sum);
        System.out.println("Total Taxable Income: " + sum);
        System.out.print("Total Tax Payable: " + mytaxFor2022);

    }


    public  static void justPrintAmount(double[] taxableAmount) {
        for(double amount : taxableAmount) {
            System.out.println(amount);
        }
    }

    public static double[] collectTaxableAmount() {
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter taxable income ( or -1 to end ) : ");
            double val = scan.nextDouble();
            if (val == -1) {
                break;
            }
            array[i] = val;
        }
        return array;
    }

    public static double computeTotalAmount(double[] taxableAmount) {
        double sum = 0;
        for(double amount : taxableAmount) {
            sum +=amount;
        }

        return sum;
    }

    public static double computeTax2023(double totalTaxableIncome) {
        return 0;
    }
    public static double computeTax2022(double totalTaxableIncome) {
        double totalTaxPayable = 0;
        if (totalTaxableIncome < 250000) {
            totalTaxPayable = 0;
        } else if (totalTaxableIncome <= 400000) {
            totalTaxPayable = 0.20 * (totalTaxableIncome - 250000);
        } else if (totalTaxableIncome <= 800000) {
            totalTaxPayable = 30000 + (0.25 * (totalTaxableIncome - 400000));
        } else if (totalTaxableIncome <= 2000000) {
            totalTaxPayable = 130000 + (0.30 * (totalTaxableIncome - 800000));
        } else if (totalTaxableIncome <= 8000000) {
            totalTaxPayable = 490000 + (0.32 * (totalTaxableIncome - 2000000));
        } else if (totalTaxableIncome > 8000000) {
            totalTaxPayable = 2410000 + (0.35 * (totalTaxableIncome - 8000000));
        }

        return totalTaxPayable;
    }

}
