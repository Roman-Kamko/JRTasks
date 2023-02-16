package syntax.arrays;

import java.util.Scanner;

public class ArraysTask10 {
    /*Считать 6 строк и заполнить ими массив strings.
    Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").*/
    public static String[] strings;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i]= sc.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String tmp = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (tmp != null && tmp.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
