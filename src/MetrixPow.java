public class MetrixPow {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr = {
                {2, 3, 4},
                {8, 7, 5},
                {9, 10, 2}
        };
        int result;

        //  System.out.println(array);
        System.out.println("Матрица 1:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Матрица 2:");

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(" " + arr[k][l]);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        result = array[i][j] * arr[k][l];
                        System.out.println(" " + result);
                    }
                }
            }
        }

    }
}
