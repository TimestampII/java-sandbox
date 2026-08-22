package Sprint_1;

public class Array {
    public static void main(String[] args) {
        String[] currencies = {"USD","EUR","JPY","RUB"};

        System.out.println("Список поддерживаемых валют:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);

        System.out.println("Не везде пригодиться: " + currencies[0]);
        currencies[0] = "CHF";
        System.out.println("В Швейцарии в обращении: " + currencies[0]);

        System.out.println("В Дании не примут: " + currencies[1]);
        currencies[1] = "DKK";
        System.out.println("Там нужны: " + currencies[1]);

        System.out.println("Зачем нам в Китае: " + currencies[2]);
        currencies[2] = "CNY";
        System.out.println("Купим: "+ currencies[2]);

        System.out.println("В Беларуси родные: " + currencies[3]);
        currencies[3] = "BYN";
        System.out.println("Поменяю на местные: " + currencies[3]);

        // теперь список поддерживаемых валют другой
        System.out.println("Новый список поддерживаемых валют:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);
    }
}