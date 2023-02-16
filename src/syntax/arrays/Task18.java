package syntax.arrays;

import java.util.Arrays;

public class Task18 {
    /*исправить ошибки, чтобы в консоль вывелось:
    [[A, L, L], [G, A, L, A, B, U, G, S], [W, E, R, E], [D, E, S, T, R, O, Y, E, D]]
    Используй необходимые методы класса Arrays.*/

    public static int[][] rockets = {{0,1,1,1,0,0,0,1},{1,0,0,0,1,1,1,0,1,1},{1,0,1,1,0,0,1,1,1,0},{0,1,1,1,0,1,1,1,0,1,0}};
    public static int[][] galabugs = {{0,1,1,1,0,0,0,1},{1,0,0,0,1,1,1,0,1,1},{1,0,1,1,0,0,1,1,1,0},{0,1,1,1,0,1,1,1,0,1,0}};
    public static char[][] message = {
            {'A','L','L'},
            {'G','A','L','A','B','U','G','S'},
            {'W','E','R','E'},
            {'D','E','S','T','R','O','Y','E','D'}
    };

    public static void main(String[] args) {
        if (Arrays.deepEquals(rockets, galabugs)) {
            System.out.println(Arrays.deepToString(message));
        }
    }
}
