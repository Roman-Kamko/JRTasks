package syntax.arrays;

import java.util.Scanner;

public class Task14 {
    /*Двумерный массив — это массив массивов, то есть в каждой
    его ячейке находится ссылка на некий массив. Но гораздо
    проще его представить в виде таблицы, у которой задано
    количество строк (первое измерение) и количество столбцов
    (второе измерение).*/

    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        multiArray = new int[sc.nextInt()][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray [i] = new int[sc.nextInt()];
        }
        printArray(multiArray);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
