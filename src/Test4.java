public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 10) - 5);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int countMin = 1;
        int countMax = 1;
        int tempMax = arr[0];
        int tempMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tempMin){
                countMin += 1;
            }
            if (arr[i] == tempMax){
                countMax += 1;
            }
        }
        System.out.println("\nCount min index = " + countMin + "\nCount max index = " + countMax);
    }
}
