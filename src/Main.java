public class Main {

    public static void main(String[] args) {
        task1();// Задача 1
        task2();// Задача 2
        task3();// Задача 3
        task4();// Задача 4
        task5();// Задача 5
    }

    public static void task1 () {
        System.out.println("Задача 1");
        /*
            Задача 1
            С помощью цикла for выведите в консоль все числа от 1 до 10.
         */
        for (int i = 1; i < 11; i++) {
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
        for (int i = 0; i <= 17; i++) {
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

    }
}