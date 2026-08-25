package Sprint_1;


import java.util.Scanner;

public class Jaba {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isTrafficLightGreen = false; // отвечает за зелёный сигнал светофора
        boolean isVehicleApproaching = false; // отвечает за приближающийся транспорт
        boolean isSafePlace = false; // итоговый флаг: безопасно ли переходить дорогу

        System.out.println("Вы находитесь около пешеходного перехода (да/нет)?");
        String onCrosswalk = scanner.nextLine();
        boolean isOnCrosswalk = onCrosswalk.equals("да");

        if (isOnCrosswalk) {
            // Правило 1: на переходе идти можно только на зелёный свет светофора
            System.out.println("Горит ли зелёный сигнал светофора (да/нет)?");
            String trafficLightGreen = scanner.nextLine();
            isTrafficLightGreen = trafficLightGreen.equals("да");

            if (!isTrafficLightGreen) {
                System.out.println("Не переходите дорогу на красный свет светофора!");
            } else {
                isSafePlace = true;
            }
        } else {
            // Правило 2: не на переходе — сначала проверяем движение транспорта
            System.out.println("Видите ли вы приближающиеся автомобили (да/нет)?");
            String vehicleApproaching = scanner.nextLine();
            isVehicleApproaching = vehicleApproaching.equals("да");

            if (isVehicleApproaching) {
                // Машина едет — дальше спрашивать нечего, переход уже небезопасен
                System.out.println("Дождитесь, пока проедет транспортное средство!");
            } else {
                // Правило 4: нельзя перебегать дорогу у поворотов, остановок, перекрёстков
                System.out.println("Находится ли вблизи вас поворот (П), остановка (А), перекрёсток (Х) или нет?");
                String unsafePlaceType = scanner.nextLine();
                switch (unsafePlaceType) {
                    case "П":
                        System.out.println("Не перебегайте дорогу вблизи поворотов!");
                        break;
                    case "Х":
                        System.out.println("Не перебегайте дорогу вблизи перекрестков!");
                        break;
                    case "А":
                        System.out.println("Не перебегайте дорогу вблизи остановок общественного транспорта!");
                        break;
                    default:
                        isSafePlace = true;
                }
            }
        }

        // Итоговое решение принимается в одном месте на основании всех собранных ответов
        if (isSafePlace) {
            System.out.println("Вы можете перейти дорогу!");
            System.out.println("Сколько полос движения на дороге?");
            int linesCount = scanner.nextInt();

            // Правило 3: на нескольких полосах — сначала смотрим налево, потом направо
            if (linesCount == 1) {
                System.out.println("Посмотрите в обе стороны и переходите.");
            } else {
                int halfWay = linesCount / 2;
                for (int line = 1; line <= linesCount; line++) {
                    if (line <= halfWay) {
                        System.out.println("Посмотрите налево и переходите.");
                    } else {
                        System.out.println("Посмотрите направо и переходите.");
                    }
                }
            }
        } else {
            System.out.println("Вы не можете перейти дорогу в этом месте!");
        }
    }
}