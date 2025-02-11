public class Recursion_linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int se = 11;

        if (se == linear_search(arr,0,se)) {
            System.out.println("We founded Search item : "+linear_search(arr, 0,se));
        }else{
            System.out.println("We can not founded any search item in the array ");
        }
    }

    public static int linear_search(int[] arr , int index, int search_item){
        
        if (index == arr.length - 1) {
            if (arr[index] != search_item) {
                return -1;
            }
        }
        if (index <= arr.length - 1) {
            if (arr[index] == search_item) {
                return arr[index];
            }
        }

        return linear_search(arr, index+1,search_item);

    }

    // public static boolean search(int[] arr,int index,int se){
    //     if (index > arr.length - 1) {
    //         return false;
    //     }

    //     return arr[index] == se || search(arr, index+1, se);

    // }
}
