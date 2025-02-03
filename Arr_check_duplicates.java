public class Arr_check_duplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3};

        System.out.println(check_Arr(arr));
    }
    
    public static int check_Arr(int[] arr){
        if ( arr == null || arr.length == 0) {
            return -1;
        }
        int unique = 0;

        for(int i : arr){
            unique = unique ^ i;
        }

        return unique;
    }
}
