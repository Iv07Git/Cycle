//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        System.out.println("Задача 2");
            for (int i2 = 10; i2 >= 1; i2 = i2-1) {
                System.out.println(i2);
            }
        System.out.println("Задача 3");
            for (int i3 = 0; i3 <= 17; i3 += 2) {
                if (i3 % 2 == 0) {
                    System.out.println(i3);
                }
            }
        System.out.println("Задача 4");
            for (int i4 = 10; i4 >= -10; i4 -= 1) {
                System.out.println(i4);
            }
        System.out.println("Задача 5");
            for (int year = 1904; year <= 2096; year += 4) {
                System.out.println(year + " год является високосным");
            }
        System.out.println("Задача 6");
            for (int i6 = 7; i6 <= 98; i6 += 7) {
                System.out.println(i6);
            }
        System.out.println("Задача 7");
            for (int i7 = 1; i7 <= 512; i7 *= 2) {
                System.out.println(i7);
            }
        System.out.println("Задача 8");
            int deposit = 29000;
            double sum = 0;
            for (int month = 1; month <= 12; month++) {
                sum = sum + deposit;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        System.out.println("Задача 9");
            int deposit9 = 29000;
            double sum9 = 0;
            for (int month9 = 1; month9 <= 12; month9++) {
                sum9 = sum9 * 1.01;
                sum9 = sum9 + deposit9;
                System.out.println(String.format("Месяц %d, сумма накоплений равна %.2f рублей", month9, sum9));
            }
        System.out.println("Задача 10");
            for (int i = 1; i <= 10; i++) {
                System.out.println("2" + "*" + i + "=" + i * 2);
            }
    }
}