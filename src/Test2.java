import java.util.Scanner;
public class Test2 {
    static String rekt (int arg1, int arg2) {
       if (arg1 > arg2){
           return "Первое число больше второго";
       } else if (arg1 < arg2){
           return "Первое число меньше второго";
       }
       return "Числа равны";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        String result = rekt(a,b);
        System.out.print(result);
    }
}
