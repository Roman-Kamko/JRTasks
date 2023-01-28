package syntax.loops;

import java.util.Scanner;

public class LoopsTask12 {
    /*Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например,
    строка или символ. Выведи на экран минимальное число из введенных. Если введено несколько таких чисел, необходимо
    вывести любое из них.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNum = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int inputNum = scanner.nextInt();
            if (inputNum < minNum) {
                minNum = inputNum;
            }
        }
        System.out.println(minNum);
    }
}
