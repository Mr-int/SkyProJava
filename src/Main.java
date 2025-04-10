public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 2
        System.out.println("\nЗадача 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 3
        System.out.println("\nЗадача 3:");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 4
        System.out.println("\nЗадача 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 5
        System.out.println("\nЗадача 5:");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        // Задача 6
        System.out.println("Задача 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 7
        System.out.println("\nЗадача 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 8
        System.out.println("\nЗадача 8:");
        int save = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total += save;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println(total);

        //Задача 9
        System.out.println("Задача 9:");
        double savings = 0;
        double monthlyDeposit = 1000;
        double monthlyRate = 0.01;

        for (int month = 1; month <= 12; month++) {
            savings += monthlyDeposit;
            savings *= (1 + monthlyRate);
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, savings);
        }

        //Задача 10
        System.out.println("Задача 10:");
        for (int i = 1; i < 11; i++) {
            System.out.print("2*" + i + "=" + i*2 + "\n");
        }
    }
}