package syntax.arrays;

public class ArraysTask4 {
   /* Дан массив чисел. В методе main нужно посчитать:
    х — сумму всех нечетных элементов массива
    у — сумму всех четных элементов массива
    и вывести в виде: (х;у)*/

    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        /*for (int i = 0; i < coordinates.length; i++) {
            if (coordinates[i] % 2 != 0) {
                x += coordinates[i];
            }
            if (coordinates[i] % 2 == 0) {
                y += coordinates[i];
            }*/
        for (int tmp : coordinates) {
            if (tmp % 2 != 0) {
                x += tmp;
            } else if (tmp % 2 == 0) {
                y += tmp;
            }
        }
        System.out.println("(" + x + ";" + y + ")");
    }
}
