package syntax.loops;

import java.util.Scanner;

public class LoopsTask18 {
    /*Напиши программу, которая считывает с клавиатуры целые числа и выводит их на экран, пока не введено число,
    кратное 10. В программе нужно использовать цикл do-while.*/
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);

        int tmp;
        do {
            tmp = bombInterface.nextInt();
            System.out.println(tmp);
        } while (!(tmp % 10 == 0));
    }
}
