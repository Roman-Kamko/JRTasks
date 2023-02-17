package syntax.arrays;

import java.util.Arrays;

public class Task23 {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static int x = (int) (Math.random() * width);

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

        for (int i = 0; i < bombs.length; i++) {
            Arrays.fill(bombs[i], 0);
        }

        for (int i = 0; i < bombs.length; i++) {
            for (int j = 10; j > 0;) {
                int bomb = (int) (Math.random() * width);
                if (bombs[i][bomb] == 0) {
                    bombs[i][bomb] = 1;
                    j--;
                }
            }
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
