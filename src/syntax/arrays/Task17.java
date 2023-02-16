package syntax.arrays;

public class Task17 {
    /*Дан двумерный массив array (массив, который хранит ссылки на массивы-строки).
    Необходимо его проинициализировать массивами-строками, длина которых равна
    2 * <номер массива-строки> + 1. То есть array[0] будет иметь длину 2 * 0 + 1 = 1,
    array[1] будет иметь длину 2 * 1 + 1 = 3 и т. д.
    Заполни все массивы-строки числами, которые равны номеру элемента в
    массиве-строке + номер самой строки.*/
    public static int[][] array = new int[5][];

    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[2 * i + 1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
