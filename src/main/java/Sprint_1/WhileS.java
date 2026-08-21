package Sprint_1;

import java.util.Random;

public class WhileS {
    public static void main(String[] args) {
        Random random = new Random(); // генерирует случайное число

        int dayCount = 0; // для учёта дней накоплений
        int moneyTotal = 0; // суммарное количество накоплений
        int moneyToday; // сколько откладываем сегодня
        int goal = 5000; // финансовая цель

        while (moneyTotal <= goal) {
            moneyToday = random.nextInt(300);
            moneyTotal = moneyTotal + moneyToday;
            dayCount++;
        }
        System.out.println("Ура! Вы смогли накопить " + goal + " за " + dayCount + " дней.");
    }
}
