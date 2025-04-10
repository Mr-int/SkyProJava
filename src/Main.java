public class Main {
    public static void main(String[] args) {
        // Задача 1
        int intObject = 278183;
        byte byteObject = 101;
        short shortObject = 12000;
        long longObject = 1009975312345L;
        float floatObject = 2.2f;
        double doubleObject = 20.4567890;
        System.out.println("Значение переменной 'intObject' с типом 'int' равно " + intObject);
        System.out.println("Значение переменной 'byteObject' с типом 'byte' равно " + byteObject);
        System.out.println("Значение переменной 'shortObject' с типом 'short' равно " + shortObject);
        System.out.println("Значение переменной 'longObject' с типом 'long' равно " + longObject);
        System.out.println("Значение переменной 'floatObject' с типом 'float' равно " + floatObject);
        System.out.println("Значение переменной 'doubleObject' с типом 'double' равно " + doubleObject + "\n");

        // Задача 2
        float number1 = 27.12f;
        long number2 = 987678965549L;
        float number3 = 2.786f;
        short number4 = 569;
        short number5 = -159;
        short number6 = 27897;
        byte number7 = 67;

        // Задача 3
        byte ludmilaPavlovna = 23;
        byte annasergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short papers = 480;
        int papersOnChild = papers / (ludmilaPavlovna + annasergeevna + ekaterinaAndreevna) ;
        System.out.println("На каждого ученика рассчитано " + papersOnChild + " листов бумаги" + "\n");

        // Задача 4
        byte bottlePerMinute = 16 / 2;
        int twentyMinute = bottlePerMinute * 20;
        int perDay = 1440 * bottlePerMinute;
        int perThreeDay = perDay * 3;
        int perMonth = perThreeDay * 10;
        System.out.println("За 20 минут"+ " машина произвела" + twentyMinute + "штук бутылок");
        System.out.println("За сутки"+ " машина произвела" + perDay + "штук бутылок");
        System.out.println("За 3 дня"+ " машина произвела" + perThreeDay + "штук бутылок");
        System.out.println("За 1 месяц"+ " машина произвела" + perMonth + "штук бутылок");

        // Задача 5
        byte Paint = 120;
        byte white = 2;
        byte brown = 4;
        int allClass = Paint / ( white + brown);
        int whitePaint = allClass * white;
        int brownPaint = allClass * brown;
        System.out.println("В школе, где " + allClass + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски" + "\n");

        // Задача 6
        short bananas = 80;
        short milk = 105;
        short iceCreamOneBricket = 100;
        short egg = 70;
        int breakfast = (bananas * 5) + (milk * 2) + (iceCreamOneBricket * 2) + (egg * 4);
        int breakfastKg = breakfast / 1000;
        System.out.println(breakfast + "грамм");
        System.out.println(breakfastKg + "кг" + "\n");

        // Задача 7
        short targetWeightLoss = 7 * 1000;
        int minLose = targetWeightLoss / 500;
        int maxLose = targetWeightLoss / 250;
        int averageDays = (minLose + maxLose) / 2;
        System.out.println("Если терять по 250 г в день, понадобится: " + maxLose + " дней");
        System.out.println("Если терять по 500 г в день, понадобится: " + minLose + " дней");
        System.out.println("В среднем потребуется: " + averageDays + " дней");

        // Задача 8
        double Masha = 67760;
        double Denis = 83690;
        double Kristina = 76230;
        double raise = 1.1;
        double newSalaryMasha = Masha * raise;
        double newSalaryDenis = Denis * raise;
        double newSalaryKristina = Kristina * raise;
        double yearlySalaryMasha = (newSalaryMasha - Masha) * 12;
        double yearlySalaryDenis = (newSalaryDenis - Denis) * 12;
        double yearlySalaryKristina = (newSalaryKristina - Kristina) * 12;
        System.out.println("Маша теперь получает " + (int) newSalaryMasha + " рублей. Годовой доход вырос на " + (int) yearlySalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + (int) newSalaryDenis + " рублей. Годовой доход вырос на " + (int) yearlySalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + (int) newSalaryKristina + " рублей. Годовой доход вырос на " + (int) yearlySalaryKristina + " рублей.");
    }
}