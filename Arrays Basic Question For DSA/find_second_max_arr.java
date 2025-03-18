import java.util.Arrays;

public class find_second_max_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("array is sorted or not "+check_arr_sort(arr));
        System.out.println("Second Largest Number in the Array : "+second_largest_num_arr(arr));
    }

    // This function is basically check the Array is sorted or not
    public static boolean check_arr_sort(int[] arr){
        if(arr == null || arr.length == 0)return false;

        boolean ans = true;
        for(int i=0; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                ans = false;
            }
        }
        return ans;
    }

    public static int second_largest_num_arr(int[] arr){
        if(arr == null || arr.length == 0)return -1;

        int second_large_num = 0;
        if (check_arr_sort(arr)) {
            second_large_num = arr[arr.length - 2];
        }

        return second_large_num;
    }
}
