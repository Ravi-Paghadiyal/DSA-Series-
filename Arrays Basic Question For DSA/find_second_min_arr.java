import java.util.Arrays;

public class find_second_min_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Second Minimum Number in the Array : "+second_minimum_num_arr(arr));
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

    public static int second_minimum_num_arr(int[] arr){
        if(arr == null || arr.length == 0)return -1;

        // This is normal Way to find second minimum number in the array
        //We can solve another way to find second minimum number in the 
        // When we are solve Leedcode problem's 
        if(check_arr_sort(arr)){
            return arr[1];
        }

        return -1;
    }
}
