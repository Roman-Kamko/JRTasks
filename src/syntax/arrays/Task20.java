package syntax.arrays;

import java.util.Arrays;

public class Task20 {
   /* Давай расположим на поле роботанки с таким условием, что в одном ряду будет один роботанк, его позицию выбери сам.
    Например, для определения позиции можно воспользоваться генератором случайных чисел:
    int x = (int) (Math.random() * n);
    таким образом в переменную x будет помещено случайное число в диапазоне от 0 (включая) до n (не включая).
    Чтобы поместить роботанк на поле, нужно значение соответствующего элемента массива field заменить на значение переменной robotank.
    Выведи на экран массив field с роботанками. Пустое поле при этом выводить не нужно.*/

    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static int x = (int) (Math.random() * 10);

    public static String[][] field = new String[height][width];

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
    }
}
