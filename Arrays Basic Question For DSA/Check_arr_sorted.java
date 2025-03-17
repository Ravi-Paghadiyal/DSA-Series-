public class Check_arr_sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(check_arr_sort(arr));
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
}
