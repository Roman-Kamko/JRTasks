package syntax.loops;

public class LoopsTask5 {
    public static void main(String[] args) {
        /*Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10
        (ширина), заполненный буквой 'Q'.*/
        char filler = 'Q';
        int i = 0;

        while (i < 5) {
            int j = 0;
            while (j < 10) {
                System.out.print(filler);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
