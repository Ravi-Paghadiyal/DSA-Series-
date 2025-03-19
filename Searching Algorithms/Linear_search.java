import java.util.Arrays;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {0,1,5,4,3,9,8};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Search Element Present At Index Number : "+linear_search(arr, 40));
    }

    public static int linear_search(int[] arr,int search_num){
        if(arr == null  || arr.length == 0) return 0;

        int i=0;
        while (i != arr.length-1) {
            if(arr[i] == search_num){
                return i;
            }
            i++;
        }
        return -1;
    }
        
}