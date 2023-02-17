package syntax.arrays;

import java.util.Arrays;

public class Task22 {
    /*Пришла пора нанести удар по роботанкам. Для этого нужно наложить массив бомб на поле,
    и если в ячейках с одинаковыми индексами массивов fields и bombs находится роботанк и
    бомба (бомба попала в роботанк), то фиксируем попадание — записываем в соответствующую
    ячейку массива field значение переменной hit.
    Осталось только перенести вывод массива field на экран так, чтобы было выведено поле
    уже после "бомбардировки". Больше ничего выводить не нужно.*/

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
            }
        }
        for (int[] ints : bombs) {
            Arrays.fill(ints, 0, 10, 1);
            Arrays.fill(ints, 10, 30, 0);
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(robotank) && bombs[i][j] == 1) {
                    field[i][j] = hit;
                }
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
