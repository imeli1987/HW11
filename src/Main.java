import java.time.LocalDate;

public class Main {

// Проверка високосного года
    public static boolean checkingLeapYear(int year){

        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && (year >= 1584)) {
            return true;
        }
        return false;
    }

// Проверка операционной системы
    public static void returnOS(int OS, int clientDeviceYear){

        String oS = "";

        if (OS == 1) {
            oS = "Android";
        } else if (OS == 0) {
            oS = "iOS";
        }

        if (clientDeviceYear < 2015){
            System.out.printf("Установите облегченную версию приложения для %s по ссылке\n", oS);
        } else {
            System.out.printf("Установите версию приложения для %s по ссылке\n", oS);

        }
    }

// Расчет времени доставки
    public static void deliveryTime(int deliveryDistance){

        int countDay = 1;

        if ( deliveryDistance >= 0 && deliveryDistance < 20){
            System.out.println("Потребуется дней: " + countDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60 ) {
            System.out.println("Потребуется дней: " + (countDay+1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (countDay+2));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {

// Задание 1

        int year = 2024;

        if (checkingLeapYear(year)) {
            System.out.printf("%d год - високосный год\n", year);
        } else {
            System.out.printf("%d год - невисокосный год\n", year);
        }

        System.out.println();

// Задание 2

        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();

        returnOS(clientOS, currentYear);

        System.out.println();

// Задание 3

        int deliveryDistance = 95;

        deliveryTime(deliveryDistance);
    }
}