import java.util.*;
public class DataStructureAssignment2Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter numbers: ");
        for(int i = 0; i<size; i++)
            arr[i] = input.nextInt();

        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                sorted = false;
                break;
            }
        }

        System.out.println(sorted ? "Sorted" : "Not Sorted");
    }
}
