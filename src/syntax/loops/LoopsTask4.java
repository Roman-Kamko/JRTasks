package syntax.loops;

import java.util.Scanner;

public class LoopsTask4 {
    public static void main(String[] args) {
        /*Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не
        введет слово "ENTER". Вывести на экран полученную сумму и завершить программу.
        1. Программа должна считывать данные c клавиатуры.
        2. Необходимо посчитать сумму введенных целых чисел и вывести её на экран, если пользователь ввел стоп слово.
        3. В программе необходимо использовать цикл while.*/
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else if (scanner.nextLine().equals("ENTER")) {
                System.out.println(sum);
                break;
            }
        }
    }
}
