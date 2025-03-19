import java.util.Arrays;

public class count_ele_occurrence {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,3,3,4,5,};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("occurrence of an element in the array : "+count_num(arr,1 ));
    }
    public static int count_num(int[] arr,int count_element){
        if(arr == null  || arr.length == 0) return 0;

        int count = 0,i=0;
        
        while (i != arr.length-1) {
            if (arr[i] == count_element) {
                count++;
            }
            i++;
        }
        return count;
    }
}