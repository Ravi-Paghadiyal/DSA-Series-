import java.util.Arrays;

class Revers_arr{
    public static void main(String[] args){
        int[] arr = {1,2,10,4,5,0,-1,-2};
        getRevers_Arr(arr);
        System.out.println("This is Revers Array : "+Arrays.toString(arr));
    }

    // This Method is Revers The arrays
    public static void getRevers_Arr(int[] arr){
        if(null == arr || arr.length == 0){
            System.out.println("Please Enter First Elements in the array");
        }
        int start =0;
        int end = arr.length - 1;
        int temp = 0;

        while(start < end){
            // swap the elements
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // move the pointers
            start++;
            end--;
        }
    }
}