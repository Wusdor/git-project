public class factorial {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        do {
            b *= a--;
        }
        while (a > 0);
        System.out.println("Факториал равен: " + b);
    }
}
