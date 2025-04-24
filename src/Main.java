public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan ";
        String midleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + midleName;
        System.out.println("Ф.И.О сотрудника - " + fullName + "\n");

        System.out.println("Task 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета " + upperFullName + "\n");

        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф.И.О сотрудника " + fullName);
    }
}
