package syntax.arrays;

import java.util.Arrays;

public class Task12 {
    /*Проинициализируй двумерный массив при объявлении любыми значениями
    (рекомендуем использовать быструю инициализацию). Размерность массива
    должна быть 3х4 (высота-ширина). Переверни массив зеркально относительно
    центральной строки*/

    public static int[][] array =
            new int[][] {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 0}};

    public static void main(String[] args) {

        printArray();

        int[] row1 = array[0];
        array[0] = array[2];
        array[2] = row1;

        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
