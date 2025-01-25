public class Min {
    public static void main(String[] args) {
        int[] arr = {10,1,2,45,12};

        // create obj
        Min obj = new Min();
        int ans = obj.check_min(arr);

        System.out.println(ans);
    }
    public int check_min(int[] arr){
        int min = arr[0];

            if(arr.length == 0){
                return -1;
            }

            for(int i=0; i<arr.length; i++){
                if(min > arr[i]){
                    min = arr[i];
                }
            }

            return min;
    }
}
