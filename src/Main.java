public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + deposit;
            System.out.println("Месяц " + (i++) + ", сумма накоплений равна " + total + " рублей.");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (start = 10; start > 0; ) {
            System.out.print(start-- + " ");
            System.out.println();
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int born = 17;
        int death = 8;
        int population = 12_000_000;
        int growth = born - death;
        for (int i = 1; i <= 10; i++) {
            population = population + (population * growth / 1000);
            System.out.println("Год " + i + ", население " + population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total < 12_000_000) {
            total = (int) (total + (total * 0.07));
            total = total + deposit;
            System.out.println("Месяц " + (i++) + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int deposit = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total += (total * 0.07);
            total = total + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + (i++) + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int deposit = 15000;
        int total = 0;
        int i = 0;
        for (; i <= 108; i++) {
            total += (total * 0.07);
            total = total + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + (i++) + ", сумма накоплений равна " + total + " рублей");
            }
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int dayNumber = 10; dayNumber <= 31; dayNumber++) {
            if (dayNumber % 7 == 0) {
                System.out.println("Сегодня пятница " + dayNumber + "-е число. Необходимо подготовить отчет");
                continue;
            }
            System.out.println("Сегодня " + dayNumber + "-е число. Отчет не нужен.");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int startYear = 0;
        int currentYear = 2022;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;
        do {startYear = startYear + 79;
                if (startYear >= pastYear && startYear < futureYear) {
                    System.out.println(startYear);
                }
        }
        while (startYear < futureYear);
    }
}