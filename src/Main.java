public class Main {

    public static void main(String[] args) {
        task1();// Задача 1
        task2();// Задача 2
        task3();// Задача 3
        task4();// Задача 4
        task5();// Задача 5
        task6();// Задача 6
        task7();// Задача 7
        task8();// Задача 8
        task9();// Задача 9
        task10();// Задача 10
    }

    public static void task1 () {
        System.out.println("Задача 1");
        /*
            Задача 1
            С помощью цикла for выведите в консоль все числа от 1 до 10.
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задача 2");
         /*
            Задача 2
            С помощью цикла for выведите в консоль все числа от 10 до 1.
         */
        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задание 4");
        /*
           Задача 3
           Выведите в консоль все четные числа от 0 до 17.
         */
        for (int i = 0; i <= 17; i++) { // Можно решить по другому for (int i = 0; i <= 17; i + 2)
            if (i % 2 == 0) {
                System.out.println("Четные числа " + i);
            }
        }
        System.out.println();
    }

    public static void task4 () {
        System.out.println("Задача 4");
        /*
           Задача 4
           Выведите в консоль все числа от 10 до −10 от большего числа к меньшему.
         */
        for (int i = 10; i > -11; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }

    public static void task5 () {
        /*
           Задача 5
           Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
           В консоль результат должен выводиться в формате: «… год является високосным».
         */
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println();
    }


    public static void task6 () {
        System.out.println("Задача 6");
        /*
           Задача 6
           Напишите программу, которая выводит в консоль последовательность чисел:
           7 14 21 28 35 42 49 56 63 70 77 84 91 98
         */
        for (int i = 7; i < 100; i = i +7) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task7 () {
        System.out.println("Задача 7");
         /*
           Задача 7
           Напишите программу, которая выводит в консоль последовательность чисел:
           1 2 4 8 16 32 64 128 256 512
         */
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task8 () {
        System.out.println("Задача 8");
        /*
           Задача 8
           Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц
           вы будете откладывать по 29 000 рублей «в банку». Выведите сумму накоплений
           за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
         */
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }


    public static void task9 () {
        System.out.println("Задача 9");
         /*
           Задача 9
           Перепишите решение задачи выше при условии, что деньги вы откладывать будете
           не «в банку», а в банк под проценты — 12% годовых.
           Выведите сумму накоплений за каждый месяц в консоль в формате:
           «Месяц …, сумма накоплений равна … рублей».
         */
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void task10 () {
        System.out.println("Задача 10");
         /*
           Задача 10
           Напишите программу, которая выводит в консоль таблицу умножения на 2:
           2*1=2
           2*2=4
           2*3=6
           2*4=8
           2*5=10
           2*6=12
           2*7=14
           2*8=16
           2*9=18
           2*10=20
         */
        int n = 2; // Указали переменную для которой хотим вывести таблицу умножения
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}