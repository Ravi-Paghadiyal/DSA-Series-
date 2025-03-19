import java.util.Arrays;

public class Binary_search{
    public static void main(String[] args){
        // Array Must be sorted in binary search
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Search Element Present At Index Number : "+binary_search(arr, 5));
    }

    public static int binary_search(int[] arr, int search){
        if(arr == null || arr.length == 0) return -1;

        int start = 0, end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == search) {
                return mid;
            }else if(search > arr[mid]){
                start = mid + 1;
            }else if(search < arr[mid]){
                end = mid - 1;
            }
        }

        return 0;
    }
}