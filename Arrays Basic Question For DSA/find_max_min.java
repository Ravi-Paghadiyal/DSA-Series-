public class find_max_min {
    public static void main(String[] args) {
        int[] arr = {10,2,1,0,5,1,11};
        System.out.println("Maximum Number is : "+max(arr));
        System.out.println("Minimum Number is : "+min(arr));
    }

    public static int max(int[] arr){
        if(arr == null || arr.length == 0)return -1;
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(max < arr[j]) max = arr[j];
            }
        }
        return max;
    }

    public static int min(int[] arr){
        if(arr == null || arr.length == 0)return -1;
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(min > arr[j]) min = arr[j];
            }
        }
        return min;
    }
}