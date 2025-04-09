public class Main {
    public static void main(String[] args) {
        int age = 42;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний \n");
        } else {
            System.out.println("Ты не достиг совершеннолетия, нужно немного подождать \n");
        }

        int temp = 2;
        if (temp > 5) {
            System.out.println("Сегодня тепло, на улице " + temp + " (градуса), можно идти без шапки \n");
        } else {
            System.out.println("На улице холодно, на улице " + temp + " (градуса), нужно надеть шапку \n");
        }

        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф \n");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно \n");
        }

        int age4 = 20;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад\n");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу\n");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет\n");
        } else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу\n");
        }

        int age5 = 10;
        boolean hasAdult = true;

        if (age5 < 5) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему нельзя кататься на аттракционе\n");
        } else if (age5 >= 5 && age5 < 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе в сопровождении взрослого\n");
            } else {
                System.out.println("Если возраст ребенка равен " + age5 + ", то ему нельзя кататься на аттракционе\n");
            }
        } else if (age5 >= 14) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе без сопровождения взрослого\n");
        }

        int passengers = 75;
        if (passengers < 60) {
            System.out.println("В вагоне есть сидячие места\n");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("В вагоне есть только стоячие места\n");
        } else if (passengers >= 102) {
            System.out.println("Вагон полностью забит\n");
        }

        int one = 40;
        int two = 23;
        int three = 89;
        if (one > two && one > three) {
            System.out.println(one + "\n");
        } else if (two > one && two > three) {
            System.out.println(two + "\n");
        } else {
            System.out.println(three + "\n");
        }
    }
}