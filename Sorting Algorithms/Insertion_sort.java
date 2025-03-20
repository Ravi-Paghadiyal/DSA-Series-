import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args){
        int[] arr = {0,-5,10,5,0,9,2};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.printf("Sorted Array : ");
        insertion(arr);
    }

    public static void insertion(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Please Enter Values in the Array !");
            return;
        }

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }

        for(int j : arr){
            System.out.printf(j + " ");
        }
    }
}
