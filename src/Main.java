import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        int year = 2017;
        task1(year);
        String oS= "iOS";
        int yearOfIssue = LocalDate.now().getYear();
        task2(oS, yearOfIssue);
        short deliveryDistance = 95;
        int per = task3(deliveryDistance);
        System.out.println("Потребуется дней " + per);
    }
    private static void task1(int year){
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year + " високосный год");
        }
        else{
            System.out.println(year + " не високосный год");
        }
    }
    private static void task2(String oS, int yearOfIssue){
        if (oS.equals("iOS") && yearOfIssue<2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if(oS.equals("iOS") && yearOfIssue>=2015){
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        if (oS.equals("Android") && yearOfIssue<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else if(oS.equals("Android") && yearOfIssue>=2015){
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
    }
    private static int task3(short deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20) {
            day=day;
        } else if (deliveryDistance >= 20 || deliveryDistance < 60) {
            day=day + 1;
        } else {
            day=day + 2;
        }

        return day;
    }
}