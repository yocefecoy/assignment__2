public class Exercise3Part1 {

    public static int mapping(int n, int i, int j) {
        return i * (2 * n - i + 1) / 2 + (j - i);
    } //i(i+1)/2+j

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0},
                {4, 2, 0},
                {6, 4, 3}
        };
        int n = matrix.length;
        int size = n * (n + 1) / 2;
        int[] array = new int[size];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                array[mapping(n, i, j)] = matrix[i][j];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}



