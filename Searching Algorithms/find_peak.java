import java.util.Arrays;

public class find_peak {
    public static void main(String[] args) {
        // Array Must be sorted in binary search
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Peak element in an array : "+find_peak_num(arr));
    }

    public static int find_peak_num(int[] arr){
        if(arr == null  || arr.length == 0) return -1;

        int start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
        
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && 
                (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid]; 
            }
        
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
