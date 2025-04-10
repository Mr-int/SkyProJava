public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.print("Задача 1:\n");
        int money = 0;
        int month = 0;
        while (money < 2_459_000) {
            money += 15_000;
            month += 1;
            if (money <= 2_460_000) {
                System.out.println("Месяц " + month + ": Сумма накоплений равна " + money + " рублей.");
            }
        }

        //Задача 2
        System.out.print("\nЗадача 2:\n");
        int i = 0;
        while (i != 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (;i != 0;i--) {
            System.out.print(i + " ");
        }

        //Задача 3
        System.out.print("\nЗадача 3:\n");
        int population = 12_000_000;
        double live = 17.0 / 1000;
        double dead = 8.0 / 1000;
        for (byte y = 1; y != 11; y++) {
            population += (live - dead) * population;
            System.out.print("Год " + y +", численность населения составляет " + population + "\n");
        }

        // Задача 4
        System.out.println("Задача 4:");
        double deposit4 = 15000;
        double target4 = 12000000;
        double rate4 = 0.07;
        int months4 = 0;
        while (deposit4 < target4) {
            deposit4 = deposit4 * (1 + rate4);
            months4++;
            System.out.printf("Месяц %d: %.2f рублей%n", months4, deposit4);
        }
        System.out.printf("Для накопления 12 млн нужно %d месяцев%n%n", months4);

        // Задача 5
        System.out.println("Задача 5:");
        double deposit5 = 15000;
        double target5 = 12000000;
        double rate5 = 0.07;
        int months5 = 0;
        while (deposit5 < target5) {
            deposit5 = deposit5 * (1 + rate5);
            months5++;
            if (months5 % 6 == 0) {
                System.out.printf("Месяц %d: %.2f рублей%n", months5, deposit5);
            }
        }
        System.out.printf("Для накопления 12 млн нужно %d месяцев%n%n", months5);

        // Задача 6
        System.out.println("Задача 6:");
        double deposit6 = 15000;
        double rate6 = 0.07;
        int totalMonths6 = 9 * 12;
        for (int month6 = 1; month6 <= totalMonths6; month6++) {
            deposit6 = deposit6 * (1 + rate6);
            if (month6 % 6 == 0) {
                int years = month6 / 12;
                int halfYear = (month6 % 12 == 0) ? 2 : 1;
                System.out.printf("Год %d, полугодие %d: %.2f рублей%n",
                        years, halfYear, deposit6);
            }
        }
        System.out.println();

        // Задача 7
        System.out.println("Задача 7:");
        int firstFriday = 5;
        int daysInMonth = 31;
        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет%n",
                    day);
        }
        System.out.println();

        // Задача 8
        System.out.println("Задача 8:");
        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometPeriod = 79;
        int year = 0;
        while (year <= endYear) {
            if (year >= startYear) {
                System.out.println(year);
            }
            year += cometPeriod;
        }

    }
}