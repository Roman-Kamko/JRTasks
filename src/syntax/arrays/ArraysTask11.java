package syntax.arrays;

public class ArraysTask11 {
    public static int[][] MULTIPLICATION_TABLE;
    public static void main(String[] args) {
        /*Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
        заполни его таблицей умножения и выведи в консол*/
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
