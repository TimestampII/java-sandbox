package Sprint_2;

import java.util.Scanner;

public class Voids {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void welcomeUserByName() {
        System.out.println("Как вас зовут?");
        String name = scanner.next();
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHalloByTime() {
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour < 6 & currentHour > 22) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12 && currentHour > 6) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18 && currentHour > 12) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}
