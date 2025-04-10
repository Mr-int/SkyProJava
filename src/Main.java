public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] intArray = new int[]{1, 2, 3};

        double[] doubleArray = {1.57, 7.654, 9.986};

        String[] stringArray = {"apple", "banana", "orange"};

        // Задача 2
        System.out.print(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            System.out.print(", " + intArray[i]);
        }
        System.out.println();

        System.out.print(doubleArray[0]);
        for (int i = 1; i < doubleArray.length; i++) {
            System.out.print(", " + doubleArray[i]);
        }
        System.out.println();

        System.out.print(stringArray[0]);
        for (int i = 1; i < stringArray.length; i++) {
            System.out.print(", " + stringArray[i]);
        }
        System.out.println();

        // Задача 3
        System.out.print(intArray[intArray.length - 1]);
        for (int i = intArray.length - 2; i >= 0; i--) {
            System.out.print(", " + intArray[i]);
        }
        System.out.println();

        System.out.print(doubleArray[doubleArray.length - 1]);
        for (int i = doubleArray.length - 2; i >= 0; i--) {
            System.out.print(", " + doubleArray[i]);
        }
        System.out.println();

        System.out.print(stringArray[stringArray.length - 1]);
        for (int i = stringArray.length - 2; i >= 0; i--) {
            System.out.print(", " + stringArray[i]);
        }
        System.out.println();

        // Задача 4
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
        }

        System.out.print(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            System.out.print(", " + intArray[i]);
        }
        System.out.println();
    }
}