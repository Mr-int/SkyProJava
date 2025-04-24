
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] salaryPerMonth = new int[]{12_000, 15_000, 17_000, 10_000, 13_000};
        int money = 0;
        for (int i = 0; i < salaryPerMonth.length; i++) {
            money += salaryPerMonth[i];
        }
        System.out.println("Сумма трат за месяц составила " + money + " рублей\n");

        // Задача 2
        int[] spending = new int[]{11_000, 13_000, 15_000, 17_000, 19_000};
        int maxSpend = -1;
        int minSpend = spending[0];
        for (int i = 0; i < spending.length; i++) {
            if (spending[i] > maxSpend) {
                maxSpend = spending[i];
            }
            if (spending[i] < minSpend) {
                minSpend = spending[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpend + " рублей. Максимальная сумма трат за неделю составила " + maxSpend + " рублей\n");

        // Задача 3
        int[] average = new int[]{22_000, 32_000, 45_000, 32_213, 56_000};
        double summa = 0;
        for (int i = 0; i < average.length; i++) {
            summa += average[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + (summa / average.length) + " рублей\n");

        // Задача 4
        char[] reverseFullName1 = new char[] {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] reverseFullName2 = new char[reverseFullName1.length];
        for (int i = 0; i < reverseFullName1.length; i++) {
            reverseFullName2[reverseFullName1.length - 1 - i] = reverseFullName1[i];
        }

        System.out.println(reverseFullName2);
    }
}
