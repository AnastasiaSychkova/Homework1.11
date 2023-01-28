public class Main {
   public static void main(String[] args) {
    leapYear(2021);
    appLink( 2014 , 0);
    int days = deliveryDays(12);
if (days < 0) {
    System.out.println("Доставка не осуществляется");
} else {
    System.out.println("Потребуется дней: " + days);
}

   }
   public static void leapYear(int year){
       if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
           System.out.println(year + " является високосным");
       } else {
           System.out.println(year + " не является високосным");
       }
   }

   public static void appLink(int year , int os) {
       System.out.printf("Установите %s версию приложения для %s по ссылке%n", year(year), getOs(os));
   }
   public static String getOs(int os) {
       if (os == 0)  {
           return "IOS";
       } else {
           return "ANDROID";
       }
   }
   public static String year(int year) {
       if (year > 2015) {
           return "полную";
       } else {
           return "облегченную";
       }
   }
   public static int deliveryDays(int distance) {
       if (distance < 20) {
           return 1;
       } else if (distance > 20 && distance < 60) {
           return 2;
       } else if (distance > 60 && distance < 100) {
           return 3;
       } else {
           return -1;
       }
   }
}