import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int st = 0, end = arr.length - 1;
        
        while (st <= end) {
            int mid = st + (end - st) / 2;
            
            if (arr[mid] == target)
                return mid;
            
            if (arr[mid] < target)
                st = mid + 1;
            else
                end = mid - 1;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
