import java.util.Scanner;

public class Method {
//    static int addTwo(int a) {
//        a += 2;
//        System.out.println("Значение int a = " + a);
//        return a;
//    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        char number = in.next().charAt(0);
        System.out.println(number);
//        int result = Integer.parseInt(number);
//        System.out.println("Значение result = " + result);
//        result = addTwo(result);
//        System.out.println("Значение result = " + result);
    }
}
