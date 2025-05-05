public class Main {

    public static String isLeapYear(int year) {
        String result;
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            result = year + " год, является високосным";
        }
        else {
            result = year + " год, не является високосным";;
        }
        return result;
    }

    public static String appVersionControl(int typeOs, int clientDeviceYear) {
        int currentYear = 2025;
        String result;

        if (typeOs == 0 && clientDeviceYear == currentYear) {
            result = "Установите версию приложения для iOS по ссылке";
        } else if (typeOs == 0 && clientDeviceYear < currentYear) {
            result = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (typeOs == 1 && clientDeviceYear == currentYear) {
            result = "Установите версию приложения для Android по ссылке";
        } else if (typeOs == 1 && clientDeviceYear < currentYear) {
            result = "Установите облегченную версию приложения для Android по ссылке";
        } else {
            result = "Не нашли указаный год, или вид системы";
        }

        return result;
    }

    public static String calculateDeliveryDays(int distance) {
        if (distance <= 0) {
            return "Некорректное расстояние";
        } else if (distance > 100) {
            return "Доставка невозможна";
        } else if (distance <= 20) {
            return "Потребуется дней: 1";
        } else if (distance <= 60) {
            return "Потребуется дней: 2";
        } else if (distance <= 100) {
            return "Потребуется дней: 3";
        }
        return "Некорректное расстояние";
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(appVersionControl(0, 2023));
        System.out.println(calculateDeliveryDays(20));
    }
}