import static java.lang.Math.pow;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                // System.out.println("Радиус меньше 0");
        for (; ; ) {
            double S;
            System.out.print("Введите радиус: ");
            double R = in.nextDouble();
            if (R > 0) {

                S = (Math.PI) * pow(R, 2);
                System.out.printf("Площадь круга равна: %1$.3f" , S);
            } else System.out.println("Радиус меньше 0");

            System.out.println("\n" + "Хотите продолжить? (y/n) ");
            String input = in.next();
            switch (input) {
                case "n": {
                    break;
                }
                case "y": {
                    continue;
                }
                default:  break;
            }
        break;
        }
    }
}