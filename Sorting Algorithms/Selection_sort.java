public class Selection_sort {
    public static void main(String[] args){
        int[] arr = {10,2,1,8,4,50};
        selection(arr);
    }

    public static void selection(int[] arr){
        if(arr == null || arr.length == 0) System.out.println("Please Enter Elements in the Array");

        for(int i=0; i<arr.length; i++){
            int min_index = i;

            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // swaping the values
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for(int i : arr){
            System.out.printf(i + " ");
        }
    }
}
