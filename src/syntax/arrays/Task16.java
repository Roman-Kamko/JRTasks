package syntax.arrays;

import java.util.Arrays;

public class Task16 {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    public static void main(String[] args) {
        /*Реализуй метод main(String[]), который выводит массивы strings
        и ints в консоли с помощью метода Arrays.toString().*/

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
