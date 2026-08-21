package Sprint_1;

import java.util.Scanner;

public class ScannerS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой любимый напиток:");
        String drinkName = scanner.nextLine();
        System.out.println("Мы узнали, что ваш любимый напиток — " + drinkName + ". Дарим вам кружку в подарок!");
    }
}