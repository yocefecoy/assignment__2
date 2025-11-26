public class DATASTRUCTUREASSIGMENT2_EX1 {

    //lower triangle ex1
    public static void printLower(int[][] matrix) {
        int n = matrix.length;
        System.out.println("Lower:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <=i)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    //upper triangle ex1
    public static void printUpper(int[][] matrix) {
        int n = matrix.length;
        System.out.println("Upper:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //ex1
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printLower(matrix);
        printUpper(matrix);

        int[][] matrix1 = {
                {7, 8, 9},
                {3, 2, 1},
                {6, 5, 4}
        };

        printLower(matrix1);
        printUpper(matrix1);
    }
}
