package syntax.loops;

import java.util.Scanner;

public class LoopsTask1 {
    /*Защита от землетрясения
    Глубоко под землей находится система разогрева ядра планеты. Когда она включается и программа написана неправильно,
    то город разрушается. Необходимо считать с клавиатуры число больше 0 и вывести в консоль сумму всех чисел от 0 до
    введенного числа включительно.
    Для этого используй цикл while.
    Если введенное число равно 0 или меньше, то в консоль вывести 0.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int i = 0;

        if (number > 0) {
            while (i < number) {
                sum += number - i;
                i++;
            }
            System.out.println(sum);
        } else {
            System.out.println(0);
        }
    }
}
