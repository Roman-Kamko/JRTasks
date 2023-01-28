package syntax.loops;

import java.util.Scanner;

public class LoopsTask11 {
    public static void main(String[] args) {
        /*Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например,
        строка или символ. Выведи на экран максимальное четное число из введенных. Если введено несколько таких чисел,
        необходимо вывести любое из них.*/
        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int inputNum = scanner.nextInt();
            if (inputNum % 2 == 0 && inputNum > maxNum) {
                maxNum = inputNum;
            }
        }
        System.out.println(maxNum);
    }
}
