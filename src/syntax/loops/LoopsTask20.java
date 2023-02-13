package syntax.loops;

public class LoopsTask20 {
    /*Зараженных роботов должно быть 10 и они находятся в нижнем слое, возле ядра планеты. Амиго всего один и находится
    в верхнем слое на четвертой позиции. Для отображения зараженных роботов используй переменную bug. Для отображения
    Амиго используй переменную robot.*/
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.print(bug);
            } else {
                System.out.print(land);
            }
            for (int j = 0; j < 9; j++) {
                if (i == 0 && j == 2) {
                    System.out.print(robot);
                } else if (i == 9) {
                    System.out.print(bug);
                } else {
                    System.out.print(land);
                }
            }
            System.out.println();
        }
    }
}
