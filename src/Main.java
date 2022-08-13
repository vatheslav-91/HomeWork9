import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //задание 1

        printLeapYear(2022);

        //задание 2

        int clientOS = 1;
        int deviceYear = 2021;
        printSuggestionForInstaill(clientOS, deviceYear);


        //задание 3
        int deliveryDistance = 96;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

        private static int calculateDeliveryDays ( int deliveryDistance){
            int deliveryDays = 1;
            int interval = 40;
            int startInterval = 20;
            if (deliveryDistance > startInterval) {
                deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
            }
            return deliveryDays;
        }



    private static void printSuggestionForInstaill(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String output;
        if (deviceYear < currentYear) {
            output = "Установите облегченную версию приложения для ";

        } else {
            output = "Установите версию приложения для ";
        }
        if (clientOS == 1) {
            output += "Android по ссылке ";
        } else {
            output += "IOS по ссылке ";
            System.out.println(output);
        }
    }


    //задание 1
    private static void printLeapYear(int year) {
        String output;
        if (isLeapYear(year)) {
            output = year + "год является високосный";
        } else {
            output = year + "год является високосный";
        }
        System.out.println(output);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
}