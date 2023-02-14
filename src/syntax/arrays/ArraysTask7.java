package syntax.arrays;

import java.util.Scanner;

public class ArraysTask7 {
    public static void main(String[] args) {
        /*Тебе нужно написать программу, которая:
        Считывает с консоли целое число N.
        Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
        Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
        Каждое число выводить с новой строки. Число N выводить не нужно.*/

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N > 0) {
            int[] num = new int[N];
            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }
            if (N % 2 == 0) {
                for (int i = 0; i < num.length; i++) {
                    System.out.println(num[N - i - 1]);
                }
            } else {
                for (int i = 0; i < num.length; i++) {
                    System.out.println(num[i]);
                }
            }
        }
    }
}
