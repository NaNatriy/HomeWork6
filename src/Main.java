import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        System.out.println(countYear(2022));
    }

    public static boolean countYear(int year)  {
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return leapYear;
    }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println(checkDevice(2015, 1));
    }

    public static boolean checkDevice(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }
        return false;
    }

    public static void task3() {
        System.out.println("Задача 3");
        deliveryDistance(50);
    }

    public static void deliveryDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            int deliveryDay = 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance <= 60) {
            int deliveryDay = 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance <= 100) {
            int deliveryDay = 3;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }
}