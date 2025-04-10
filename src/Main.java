public class Main {
    public static void main(String[] args) {
        byte clientOS = 0; //0-ios 1-Android
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } // 1-2 Задачи в одной, так как выполняют одно и тоже

        int year = 2021;
        if (year <= 1584) {
            System.out.println("Високосные годы введены после 1584 года\n");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным\n");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным\n");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным\n");
        } else {
            System.out.println(year + " год не является високосным\n");
        }

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1\n");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2\n");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3\n");
        } else {
            System.out.println("Доставки нет\n");
        }

        int monthNumber = 12;
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Неверный номер месяца\n");
        } else {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону зима\n");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону весна\n");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону лето\n");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону осень\n");
                    break;
            }
        }
    }
}