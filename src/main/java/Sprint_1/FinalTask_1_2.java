package Sprint_1;

import java.util.Scanner;

public class FinalTask_1_2 {
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Отобразить список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить программу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {

                if (productCount == 8) {
                    System.out.println("Извините, список полон!");
                } else {
                    System.out.println("Введите название товара: ");
                    String productName = scanner.next();

                    boolean productAlreadyExists = false;
                    for (int i = 0; i < productCount; i++) {
                        if (shoppingList[i].equals(productName)) {
                            productAlreadyExists = true;
                            break;
                        }
                    }

                    if (productAlreadyExists) {
                        System.out.println("Такой товар уже есть в списке!");
                    } else {
                        ++productCount;
                        shoppingList[productCount - 1] = productName;
                        System.out.println("Товар " + shoppingList[productCount - 1]
                                + " добавлен в список под номером " + productCount);
                    }
                }


            } else if (actionNumber == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println((i + 1) + ". " + shoppingList[i]);
                }

            } else if (actionNumber == 3) {
                for (int i = 0; i < productCount; i++) {
                    shoppingList[i] = null;
                }
                productCount = 0;
                System.out.println("Список очищен!");

            } else if (actionNumber == 4) {
                break;

            } else {
                System.out.println("Неизвестная команда!");
            }
        }

    }
}


