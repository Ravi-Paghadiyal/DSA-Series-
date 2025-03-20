public class Cyclic_Sort{
    public static void main(String[] args){
        int[] arr = {5,1,2,4,3};
        cyclic(arr);
    }

    public static void cyclic(int[] arr){
        if(arr == null || arr.length == 0){
            System.out.println("Please Enter Elements in the Array");
            return;
        }

        int i=0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;

            if (arr[i] != arr[correct_index]) {
                int temp = arr[i];
                arr[i] = arr[correct_index];
                arr[correct_index] = temp;
            }else{
                i++; 
            }
        }

        for(int j : arr){
            System.out.printf(j + " ");
        }
    }
}