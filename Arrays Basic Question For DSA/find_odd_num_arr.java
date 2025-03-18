import java.util.ArrayList;
import java.util.Arrays;

public class find_odd_num_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Odd Elements in the Array : "+Arrays.toString(check_odd(arr)));


    }

    public static int[] check_odd(int[] arr){
        if(arr == null || arr.length == 0)return new int[]{-1};
        ArrayList<Integer> oddList = new ArrayList<>();

        for(int i=0; i<arr.length; i ++){
            if (arr[i] % 2 != 0) {
                oddList.add(arr[i]);
            }
        }

        int[] ar = new int[oddList.size()];
        for(int i=0; i<oddList.size(); i++){
            ar[i] = oddList.get(i);
        }

        return ar;
    }
}
