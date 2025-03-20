public class Bubble_sort{
    public static void main(String[] args){
        int[] arr = {5,1,2,4,7,3,0,6};
        bubble(arr);
        
    }

    public static void bubble(int[] arr){
        if(arr == null || arr.length == 0) System.out.println("Please Enter Elements in the Array");

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i : arr){
            System.out.printf(i + " ");
        }
    }
}