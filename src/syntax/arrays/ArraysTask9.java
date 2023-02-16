package syntax.arrays;

import java.util.Scanner;

public class ArraysTask9 {
    /*Ввести с клавиатуры число N.
    Считать N целых чисел и заполнить ими массив array.
    Найти максимальное число среди элементов массива.*/

    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int countNum = sc.nextInt();
        array = new int[countNum];
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        System.out.println(maxNum);
    }
}
