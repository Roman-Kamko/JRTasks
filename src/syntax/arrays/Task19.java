package syntax.arrays;

import java.util.Arrays;

public class Task19 {
    /*В этой части в классе Solution нужно создать публичные статические переменные типа int:
    width, это будет ширина поля (количество столбцов);
    height, это будет высота поля (количество строк).
    Переменной width присвой значение 30, а переменной height — 10. Само поле будет представлять собой двумерный массив элементов типа String.
    Создай публичную статическую переменную field соответствующего типа и проинициализируй ее значением массива с размерностью height*width.
    В методе main заполни массив элементами со значением, равным значению переменной empty. Выведи массив на экран как показано в примере.
    Пример вывода на экран массива размерностью 5*3, значение каждого элемента равно "e":
    eeeee
    eeeee
    eeeee*/

    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;

    public static String[][] field = new String[height][width];

    public static void main(String[] args) {
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
