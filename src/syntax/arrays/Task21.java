package syntax.arrays;

import java.util.Arrays;

public class Task21 {
    /*Теперь займемся бомбами. Идея "бомбардировки" такова — каждая бомба попадает в соответствующую ячейку поля.
    Создадим массив чисел (публичная статическая переменная bombs типа int[][]) такой же размерности как и у поля
    (field), который будет содержать числа:
    0 — в ячейке нет бомбы;
    1 — в ячейке есть бомба.
    Заполни массив бомбами так, чтобы в каждой строке было 10 бомб.*/
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static int x = (int) (Math.random() * 10);

    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
            for (int j = 0; j < field[i].length; j++) {
                if (j == x) {
                    field[i][j] = robotank;
                }
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        for (int[] ints : bombs) {
            Arrays.fill(ints, 0, 10, 1);
            Arrays.fill(ints, 10, 30, 0);
            for (int num : ints) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
