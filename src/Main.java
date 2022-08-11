import java.time.LocalDate;

public class Main {
    public static int vseYear(int year) {
        if (year%4==0&&year%100!=0||year%400==0){System.out.printf("Год %s является високосным ",year );}else
        {System.out.printf("Год %s не является високосным " , year);}
        return year;

    }


    public static void supportDevice(int clientOSS,int clientDeviceYear){
        if(clientDeviceYear<2015&&clientOSS==0){System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if(clientDeviceYear<2015&&clientOSS==1){System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else if(clientDeviceYear>=2015&&clientOSS==0){System.out.println("Установите версию приложения для iOS по ссылке");}
        else if(clientDeviceYear>=2015&&clientOSS==1){System.out.println("Установите версию приложения для Android по ссылке");}else
        {System.out.println("Ваше устройство не поддерживается");}

    }

    public static int calculationOfDelivery(int deliveryDistance) {
        if(deliveryDistance>=0&&deliveryDistance<=20){System.out.println("Потребуется один день");}
        else if (deliveryDistance>20&&deliveryDistance<=60){System.out.println("Потребуется два дня");}
        else if (deliveryDistance>60&&deliveryDistance<=100){System.out.println("Потребуется три дня");}
        else {System.out.println("Сюда не доставляем");}
        return deliveryDistance;

    }


    public static void main(String[] args) {
        int year = 2003;
        vseYear(year);
        System.out.println();

//        Задание 2
        int clientDeviceYear=1500;
        int clientOSS=1;
        supportDevice(clientOSS,clientDeviceYear);

//        Задание 3
        int deliveryDistance = 60;
        calculationOfDelivery(deliveryDistance);




    }
}