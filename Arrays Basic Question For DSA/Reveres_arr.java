public class Reveres_arr {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        System.out.println("Reveres Array ");
        reveres_num(arr);

    }

    public static void reveres_num(int[] arr){
        if(arr == null || arr.length == 0)System.out.println("Please Enter First elements in the Array");

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
