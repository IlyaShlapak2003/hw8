import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        int year = 2018;
        task1(year);
        String oS= "iOS";
        int yearOfIssue = LocalDate.now().getYear();
        task2(oS, yearOfIssue);
        short deliveryDistance = 95;
        task3(deliveryDistance);
    }
    public static void task1(int year){
        if (year%4==0 || (year%100!=0 && year%400==0)){
            System.out.println(year + " високосный год");
        }
        else{
            System.out.println(year + " не високосный год");
        }
    }
    public static void task2(String oS, int yearOfIssue){
        if (oS.equals("iOS")){
            if (yearOfIssue<2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else{
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
        else{
            if (yearOfIssue<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else{
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3(short deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 20 || deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else {
            System.out.println("Потребуется дней: " + (day + 2));
        }

    }
}