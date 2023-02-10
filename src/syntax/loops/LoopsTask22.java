package syntax.loops;

public class LoopsTask22 {
    /*Наконец Амиго добрался до ядра планеты. Осталось дело за малым — уничтожить зараженных галабагами роботов.
    Чтобы отобразить в последнем слое уничтоженного робота, используй переменную death вместо bug.*/

    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.print(death);
            } else {
                System.out.print(land);
            }
            for (int j = 0; j < 9; j++) {
                if (i < 9 && j == 2) {
                    System.out.print(" ");
                } else if (i == 9) {
                    System.out.print(death);
                } else {
                    System.out.print(land);
                }
            }
            System.out.println();
        }
    }
}
