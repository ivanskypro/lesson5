package pro.sky.lesson5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        int a = 0;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        System.out.println();
        for (a = 10; a <= 10 && a >= 0; a--) {
            System.out.println(a);
        }
        System.out.println();

        System.out.println("Задание №2");
        // month - October
        int friday = 1; //
        for (friday = 1; friday <= 31; friday++) {
            if (friday % 7 == 1)
                System.out.println("Сегодня пятница " + friday + ". Необходимо подготовить отчёт!");
        }
        System.out.println();

        System.out.println("Задание №3");
        int currentYear = 2021;
        int p = currentYear - 200;
        for (p = 1821; p <= 2121; p++) {
            if (p % 79 == 0)
                System.out.println(p);
        }
        System.out.println();

        System.out.println("Задание 4");
        int d = 0;
        while (d <= 29) {
            d++;
            if (d % 5 == 0 && d % 3 == 0)
                System.out.println(d + " ping pong");
            else if (d % 3 == 0)
                System.out.println(d + " ping");
            else if (d % 5 == 0)
                System.out.println(d + " pong");
            else {
                System.out.println(d);
            }
        }
    }
}

