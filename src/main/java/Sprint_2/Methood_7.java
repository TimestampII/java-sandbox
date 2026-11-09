package Sprint_2;

public class Methood_7 {

    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses); // вызовите метод и присвойте maxExpense значение его результата
        System.out.println("Самая большая трата недели " + maxExpense);
    }

    public static double findMaxExpense(double[] expense) {
        double maxExpens = 0; // объявите метод findMaxExpense
        for (int i = 0; i < expense.length; i++) {
            if (maxExpens < expense[i]) {
                maxExpens = expense[i];
            }// реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
             // самую большую трату запишите в переменную maxExpense
        }
        return maxExpens;
    }
}
