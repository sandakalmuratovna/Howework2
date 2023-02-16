public class Main {
    public static void main(String[] args) {
        tasks1_3();
        tasks4_5();
        tasks6_8();

    }
    public static void tasks1_3() {
        System.out.println("Tasks 1-3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }

    public static void tasks4_5() {
        System.out.println("Tasks 4-5");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);


    }

    public static void tasks6_8() {
        System.out.println("Tasks 6-8");
        var firstPugilist = 78.2;
        var secondPugilist = 82.7;
        System.out.println(firstPugilist + secondPugilist);
        System.out.println(secondPugilist - firstPugilist);
        System.out.println(secondPugilist%firstPugilist);

        var allWorkHouse = 640;
        var workHours = 8;
        System.out.println("Всего работников в компании - " + allWorkHouse/workHours + " человек");

        var countOfEmpl = 94;
        System.out.println("Если в компании работает " + countOfEmpl + " человек, то всего " + allWorkHouse/countOfEmpl + " часов работы может быть поделено между сотрудниками.");

    }

}