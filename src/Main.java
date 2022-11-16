public class Main {
    public static void main(String[] args) {

        //Exercise 1 and 2

        int clientOS = 0;
        int clientDeviceYear = 2014;

        boolean newAndroid = clientOS == 1 && clientDeviceYear >= 2015;
        boolean newIOS = clientOS == 0 && clientDeviceYear >= 2015;
        boolean oldIOS = clientOS == 0 && clientDeviceYear < 2015;


        if (newIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (newAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (oldIOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Exercise 3

        int year = 1988;
        if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        //Exercise 4

        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка будет в течение 7 дней");
        }


        //Exercise 5

        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц - это зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц - это весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц - это лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц - это осень!");

        }

        //Exercise 6


        int age = 50;
        double salary = 81563.31;
        double limit;

        if (age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }


        if (salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit * 1.5 + " рублей");
        } else if (salary >= 50_000 && salary < 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit * 1.2 + " рублей");
        } else {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
        }


        //Exercise 7


        int ageEx = 25;
        double salaryEx = 200_000;
        double wantedSum = 1_000_000;

        double baseRate = 10;

        if (ageEx > 23 && ageEx < 30) {
            baseRate = baseRate + 0.5;
            if (salaryEx > 80_000) {
                baseRate = baseRate - 0.7;
            }
        } else if (ageEx < 23) {
            baseRate = baseRate + 1;
            if (salaryEx > 80_000) {
                baseRate = baseRate - 0.7;
            }
        }

        double maxPay = (salaryEx * 50) / 100;
        double basePay = (wantedSum + ((wantedSum * baseRate) / 100)) / 12;

        if (maxPay > basePay) {
            System.out.println("Максимальный платеж при ЗП " + salaryEx + " равен " + maxPay + " рублей. Платеж по кредиту " + basePay + " рублей. Одобрено!");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salaryEx + " равен " + maxPay + " рублей. Платеж по кредиту " + basePay + " рублей. Отказано!");
        }


    }
}