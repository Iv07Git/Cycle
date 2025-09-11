//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
            int month1 = 1;
            int deposit1 = 15000;
            int total1 = 0;
            while (total1 < 2459000) {
                total1 += deposit1;
                month1 ++;
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + total1 + " рублей.");
            }
        System.out.println("Задача 2");
            int i2 = 1;
            while (i2 <= 10) {
                System.out.print(i2 + " ");
                i2++;
            }
            System.out.println();
                for (int i22 = 10; i22 >= 1; i22 --) {
                    System.out.print(i22 + " ");
            }
            System.out.println();
        System.out.println("Задача 3");
            int population = 12000000;
            int birthRatePer1000 = 17;
            int mortalityRatePer1000 = 8;
            int yearNow = 2025;
            for (int year = yearNow; year < yearNow + 10;  year++) {
                population += population / 1000 * birthRatePer1000 - population / 1000 * mortalityRatePer1000;
                System.out.println("Год " + year + ", численность населения составляет " + population);
            }
        System.out.println("Задача 4");
            int downPayment4 = 15000;
            int finalAmount4 = 12000000;
            int month4 = 0;
            double monthPercent4 = 1.07;
            while (downPayment4 < finalAmount4) {
                downPayment4 *= monthPercent4;
                month4 ++;
                System.out.println("Месяц " + month4 + " сумма накоплений составит " + downPayment4 + " рублей");
            }
        System.out.println("Задача 5");
            int downPayment5 = 15000;
            int finalAmount5 = 12000000;
            int month5 = 0;
            double monthPercent5 = 1.07;
            while (downPayment5 < finalAmount5) {
                downPayment5 *= monthPercent5;
                month5 ++;
                if (month5 % 6 == 0) {
                    System.out.println("Месяц " + month5 + " сумма накоплений составит " + downPayment5 + " рублей");
                }
            }
        System.out.println("Задача 6");
            int downPayment6 = 15000;
            double monthPercent6 = 1.07;
            int month6 = 1;
            int year6 = 9;
            int allMonth6 = year6 * 12;
            for (; month6 <= allMonth6; month6++) {
                downPayment6 *= monthPercent6;
                if (month6 % 6 == 0) {
                    System.out.println("Месяц " + month6 + " сумма накоплений составит " + downPayment6 + " рублей");
                }
            }
        System.out.println("Задача 7");
            int friday = 6;
            while (friday <= 31) {
                System.out.println("Сегодня пятница " + friday + "-е число, необходимо подготовить отчет");
                friday += 7;
            }
        System.out.println("Задача 8");
            int periodComet = 79;
            int startPeriodComet = 2025 - 200;
            int endPeriodComet = 2025 + 100;
            for (int yearC = startPeriodComet; yearC <= endPeriodComet; yearC++) {
                if (yearC % periodComet == 0) {
                    System.out.println(yearC);
                }
            }
    }
}