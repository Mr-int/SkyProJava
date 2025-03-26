public class Main{
    public static void main (String args[]) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        // Задача 2
        System.out.println("Задача 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        // Задача 3
        System.out.println("Задача 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend + "\n");

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var WeightOfBothBoxer = firstBoxer + secondBoxer;
        var differenceBtwnBoxer = secondBoxer - firstBoxer;
        System.out.println(WeightOfBothBoxer);
        System.out.println(differenceBtwnBoxer + "\n");

        // Задача 7
        System.out.println("Задача 7");
        var reminedOfDivivson = secondBoxer % firstBoxer;
        System.out.println(reminedOfDivivson + "\n");

        // Задача 8
        var worksHours = 640;
        var empoyeHours = 8;
        var employe = 640 / 8;
        System.out.println("Всего работников в компании — " + employe + " человек");
        employe += 94;
        var newWorksHours = empoyeHours * employe;
        System.out.println("Если в компании работает " + employe + " человек, то всего " + newWorksHours + " часов работы может быть поделено между сотрудниками");
    }
}