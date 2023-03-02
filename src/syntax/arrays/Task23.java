package syntax.arrays;

import java.util.Arrays;

public class Task23 {
    /*Судя по результату "бомбардировки", не все роботанки были уничтожены. Давай допишем программу таким образом,
    чтобы "бомбардировки" продолжались до тех пор, пока не будут уничтожены все роботанки.
    Обрати внимание, что делать "бомбардировку" с тем же расположением бомб бессмысленно.
    В результате работы программы должен быть выведен в консоль массив field (один раз), в котором нет ни одного
    живого" роботанка.*/
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;

    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {

        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
            int r = (int) (Math.random() * width);
            for (int j = 0; j < field[i].length; j++) {
                field[i][r] = robotank;
            }
        }

        for (int hitting = 0; hitting < 10; ) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (field[i][j].equals(robotank)) {
                        generateBombs();
                        attackTanks();
                    }
                }
            }
            hitting++;
        }
        printField();
    }

    static void generateBombs() {
        for (int i = 0; i < bombs.length; i++) {
            Arrays.fill(bombs[i], 0);
            for (int j = 10; j > 0; ) {
                int bomb = (int) (Math.random() * width);
                if (bombs[i][bomb] == 0) {
                    bombs[i][bomb] = 1;
                    j--;
                }
            }
        }
    }

    static void attackTanks() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(robotank) && bombs[i][j] == 1) {
                    field[i][j] = hit;
                }
            }
        }
    }

    static void printField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
