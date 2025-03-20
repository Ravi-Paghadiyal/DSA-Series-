import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,-1,-2};
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Sorted Array : "+Arrays.toString(merge_sorting(arr)));
    }

    // We are using recurtion Here
    // We are also cover recurtion further
    public static int[] merge_sorting(int[] arr){
        if(arr.length == 1)return arr; // base condition 

        int mid = arr.length/2; // Divide the Array

        int[] left_arr = merge_sorting(Arrays.copyOfRange(arr, 0, mid));
        int[] rigth_arr = merge_sorting(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left_arr,rigth_arr);
        
    }

    public static int[] merge(int[] first, int[] second){
        // This Array Store the Final Ans
        int[] mix = new int[first.length + second.length]; 

        int i=0,j=0,k=0;

        // In the loop we can check Elements 
        // if -> my first Arrays elements are smaller than the second[Elements] so add elements to the mix array
        // else -> my second Arrays elements are smaller than the first[Elements] so add elements to the mix array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++; // here we track the mix array
        }

        // If the Any of Array Elements are remaining so we return as it is
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < first.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
