
public class ExerciseThree {
    public static boolean isSortedIterative(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedRecursive(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSortedRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] b = {1, 3, 4, 9, 5, 4};

        System.out.println(isSortedIterative(a) ? "Sorted" : "Not Sorted");
        System.out.println(isSortedIterative(b) ? "Sorted" : "Not Sorted");

        System.out.println(isSortedRecursive(a, 0) ? "Sorted" : "Not Sorted");
        System.out.println(isSortedRecursive(b, 0) ? "Sorted" : "Not Sorted");
    }
}

