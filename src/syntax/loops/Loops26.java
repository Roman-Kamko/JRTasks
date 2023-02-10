package syntax.loops;

import java.util.Scanner;

public class Loops26 {
    public static void main(String[] args) {
        /*В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
        Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон. Необходимо считать с клавиатуры
        данные типа boolean, используя метод nextBoolean() объекта типа Scanner. В зависимости от полученных данных,
        округлить переменную glass: до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1),
        если оптимист (true). Результат вывести на экран.*/

        double glass = 0.5;
        Scanner sc = new Scanner(System.in);
        boolean tmp = sc.nextBoolean();
        if (tmp == true) {
            int a = (int) Math.ceil(glass);
            System.out.println(a);
        } else {
            int a = (int) Math.floor(glass);
            System.out.println(a);
        }
    }
}
