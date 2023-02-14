package syntax.arrays;

import java.util.Scanner;

public class ArraysTask8 {
    /*Ввести с клавиатуры число N.
    Считать N целых чисел и заполнить ими массив.
    Найти минимальное число среди элементов массива и вывести в консоль.*/
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int countNum = sc.nextInt();
        array = new int[countNum];
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (minNum > array[i]) {
                minNum = array[i];
            }
        }
        System.out.println(minNum);
    }
}
