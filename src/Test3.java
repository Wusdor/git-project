/*
Подсчёт количества минимальных и максимальных значений массива, замена местами максимального и минимального значения массива
 */
public class Test3 {
    public static void main(String[] args) {
        int [] arr = new int[] {1,1,3,4,5};
       /* for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random()* 10) - 5);

        }*/
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int tempMax = arr[0]; // max значение массива
        int tempMin = arr[0]; // min значение массива
        int valueMax = 0;
        int valueMin = 0;
        int countMin = 0;
        int countMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < tempMin) {
                tempMin = arr[i];
                valueMin = i;
            }
            if (arr[i] > tempMax) {
                tempMax = arr[i];
                valueMax = i;
            }

        }
        System.out.println("\nMin index = " + valueMin + "\nMax index = " + valueMax);
       // System.out.println("\nCount min index = " + countMin + "\nCount max index = " + countMax);
        for (int i = 0; i < arr.length; i++) {
            if (i == valueMin) arr[i] = tempMax;
            else if (i == valueMax) arr[i] = tempMin;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tempMax) countMax += 1;
            else if (arr[i] == tempMin) countMin += 1;
        }

        System.out.println("Max value = " + tempMax);
        System.out.println("Min value = " + tempMin);
        System.out.println("\nCount min index = " + countMin + "\nCount max index = " + countMax);
        for (int a : arr) {
            System.out.print(a+ " ");
        }
    }
}
