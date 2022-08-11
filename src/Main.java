import java.time.LocalDate;

public class Main {
    public static int isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("Год %s является високосным ", year);
        } else {
            System.out.printf("Год %s не является високосным ", year);
        }
        return year;

    }


    public static void supportDevice(int clientOSS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String output;
        if (clientDeviceYear < currentYear) {
            output = "Установите облегченную версию приложения для ";
        } else {
            output = "Установите версию приложения для ";
        }
        if (clientOSS == 1) {
            output += "Андроид по ссылке ";
        } else {
            output += "IOS по ссылке ";
        }
        System.out.println(output);

    }

    public static int calculationOfDelivery(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется один день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется два дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется три дня");
        } else {
            System.out.println("Сюда не доставляем");
        }
        return deliveryDistance;

    }


    public static void main(String[] args) {
        int year = 2000;
        isLeapYear(year);
        System.out.println();

//        Задание 2
        int clientDeviceYear = 2020;
        int clientOSS = 0;
        supportDevice(clientOSS, clientDeviceYear);

//        Задание 3
        int deliveryDistance = 60;
        calculationOfDelivery(deliveryDistance);


    }
}