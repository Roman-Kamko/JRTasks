package syntax.loops;

import java.util.Scanner;

public class LoopsTask23 {
    public static void main(String[] args) {
        /*Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
        Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
        Результатом должно стать целое число (тип int). Для этого нужно привести к типу int результат умножения
        (отбросить дробную часть, округлив вниз до целого числа).
        В качестве значения pi используй 3.14.*/

        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        int radius = sc.nextInt();
        double circleArea = pi * radius *radius;
        int intCircleArea = (int) circleArea;
        System.out.println(intCircleArea);
    }
}
