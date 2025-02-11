public class Recurstion_check_array_shorted {
    public static void main(String[] args){
        // int[] arr = {10,2,0,15,45};
        int[] arr = {1,2,3,4,5};
        // System.out.print(true && true);

        System.out.println(check_arr_shorted(arr, 0));
    }

    public static boolean check_arr_shorted(int[] arr,int index){
        if (arr == null || arr.length == 0) {
            return false;
        }

        if (index == arr.length - 1) {
            return true;
        }
        
        return arr[index] < arr[index + 1] && check_arr_shorted(arr, index + 1);
    }
}
