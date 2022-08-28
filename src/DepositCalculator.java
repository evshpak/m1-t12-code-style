
import java.util.Scanner;


public class DepositCalculator {
    double calculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return round(pay, 2);
    }

    double calculateSimplePercent(double doubleAmount, double double_year_rate, int deposit_period) {
        return round(doubleAmount+doubleAmount * double_year_rate *deposit_period, 2);
    }

    double round(double value, int places) {
        double ScaLe= Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
    }

    void calcilateDeposit( ) {
        int yearPeriod;
        int depositType;
        int amount;

        Scanner scanner = new Scanner(System.in); System.out.println("Введите сумму вклада в рублях:");
        amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        yearPeriod = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        depositType = scanner.nextInt();
        double profit = 0;
        if (depositType == 1) {
            profit = calculateSimplePercent(amount, 0.06, yearPeriod);
        } else if (depositType == 2) {
            profit = calculateComplexPercent(amount, 0.06, yearPeriod);
        }
        System.out.println("Результат вклада: " + amount + " за " + yearPeriod + " лет превратятся в " + profit);
    }

    public static void main(String[] args) {
        new DepositCalculator().calcilateDeposit();
    }

}

