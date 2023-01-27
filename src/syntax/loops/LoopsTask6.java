package syntax.loops;

public class LoopsTask6 {
    public static void main(String[] args) {
        /*Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур)
        размером 10 (высота) на 20 (ширина) из букв 'Б'. Незаполненная часть состоит из пробелов.*/

        int i = 0;
        while (i < 10) {
            System.out.print('Б');
            int j = 0;
            while (j < 18) {
                if (i == 0 || i == 9) {
                    System.out.print('Б');
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println('Б');
            i++;
        }
    }
}
