import java.util.Scanner;

public class DataStructureAssignmentRecursive2Q3 {


    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;
        if (arr[index] > arr[index + 1])
            return false;
        return isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < size; i++)
            arr[i] = input.nextInt();

        boolean sorted = isSorted(arr, 0);
        System.out.println(sorted ? "Sorted" : "Not Sorted");
    }
}
