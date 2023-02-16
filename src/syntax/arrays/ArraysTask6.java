package syntax.arrays;

import java.util.Arrays;

public class ArraysTask6 {
    /*Для уничтожения нам нужно взломать Кибердракона и передать ему координаты
    галаксианских багов, чтобы он атаковал их, как своих врагов.
    Давай напишем программу для генерации такого массива. Нам известно, что
    галаксианские роботанки ездят по двое, всего их 200, 100 отрядов по два танка,
    поэтому нужно проинициализировать и заполнить массив на 200 элементов числам
    по следующей схеме:
    0, 1, 10, 11, 20, 21, 30, 31, ..., 990, 991.*/

    public static int[] coordinates;

    public static void main(String[] args) {
        coordinates = new int[200];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = 10 * (i / 2) + i % 2;
        }
        System.out.println(Arrays.toString(coordinates));
    }
}
