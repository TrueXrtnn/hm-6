public class Main {
        public static void main (String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
            task8();
        }
    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int i = 0;
        int salary = 15000;
        while (total<2459000){
            total = total + salary;
            i++;
        }
        System.out.println("Месяц "+ i + " , сумма накоплений равна "+ total+ "рублей");
    }
    public static void task2() {
        System.out.println("Задача 2");
      int i = 1;
      while (i<10){
          System.out.print(i+" ");
          i++;
      }
      System.out.print(i+" ");
      System.out.println();
      for (;i>=1;i--){
          System.out.print(i+" ");
      }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int differencePopulation= 17-8;
        for (int i=1; i<=10; i++){
            int FactorForDifference=0;
            FactorForDifference=population/1000;
            population = population+ (FactorForDifference*differencePopulation);
            System.out.println("Год "+i+", численность населения составляет"+population);
        }}
    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        for (int i = 1; total<12_000_000; i++){
            total= total+(total*7/100);
            total=total+salary;
            System.out.println( i+ " месяц, накопления составляют "+ total+ " рублей.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        int total = 0;
        for (int i = 1; total<12_000_000; i++){
            total= total+(total*7/100);
            total=total+salary;
            if (i%6==0) System.out.println( i+ " месяц, накопления составляют "+ total+ " рублей.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        int total = 0;
        for (int i = 1; i<=108; i++){
            total= total+(total*7/100);
            total=total+salary;
            if (i%6==0)
                System.out.println( i+ " месяц, накопления составляют "+ total+ " рублей.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int dayOfTheMonth = 5;
        for (; dayOfTheMonth<31; dayOfTheMonth= dayOfTheMonth+7){
            System.out.println("Сегодня пятница, "+ dayOfTheMonth+ " число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int fromYear = 2022-200;
        int upToAYear = 2022+100;
        int year = fromYear;
        for (; (year>=fromYear)&&(year<=upToAYear); year++){
            if (year%79==0){
                System.out.println(year);
            }
        }
    }
    }