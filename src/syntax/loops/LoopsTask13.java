package syntax.loops;

import java.util.Scanner;

public class LoopsTask13 {
    public static void main(String[] args) {
        /*В этой задаче нужно:
        Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
        Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не
        нужно, а программа может быть завершена с ошибкой. Вывести на экран второе по величине целое число после
        минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
        Минимальных чисел тоже может быть несколько.*/

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int inputNum = scanner.nextInt();
            if (inputNum < min) {
                min2 = min;
                min = inputNum;

            } else if (inputNum < min2 && inputNum > min) {
                min2 = inputNum;
            }
        }
        if (min2 == Integer.MAX_VALUE) {
            System.out.println("Введенных чисел должно быть не менее двух!");
        } else {
            System.out.println(min2);
        }
    }
}
