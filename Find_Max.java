import java.util.Scanner;

class Find_Max{
    public static void main(String[] args){
        
        // This is Array 
        //int arr[] = {10,1,5,4,7,80,0};
        int[] arr = {1,2,3,4,5};

        System.out.println("This is Maximum Number : "+getMax(arr));
        System.out.println();
        System.out.println("This is Minimum Number : "+getMin(arr));
        System.out.println();

        int max = getMax(arr);
        System.out.println("This is Second Largest Number : "+geSecond_largest_num(arr,max));
        System.out.println();

        int min = getMin(arr);
        System.out.println("This is Second Smallest Number : "+geSecond_Smallest_num(arr,min));


    }

    // This method is find Maximum Number
    public static int getMax(int[] arr){
        int max = arr[0];

        // if the arrays are empty this condition release
        if(null == arr || arr.length == 0){
            return -1;
        }
        // check the max number 
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

    // This is Methods find the Minimum Number
    public static int getMin(int[] arr){
        int min = arr[0];
        if(null == arr || arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    // This Method is Check the Second Largest Number
    // When you are find the second largest number in the array 
    // The arr Should be Shorted to you easy way to find the second larget number
    public static int geSecond_largest_num(int[] arr, int max){
        if(null == arr || arr.length == 0){
            return -1;
        }
        int Second_largest = 0;
        int n = arr.length -1;

        if(max > arr[n-1]){
            Second_largest = arr[n-1];
        }
        return Second_largest;
    }

     // This Method is Check the Second Smallest Number
    // When you are find the second Smallest number in the array 
    // The arr Should be Shorted to you easy way to find the second Smallest number
    public static int geSecond_Smallest_num(int[] arr, int min){
        if(null == arr || arr.length == 0){
            return -1;
        }
        int Second_Smallest = 0;

        if(min < arr[1]){
            Second_Smallest = arr[1];
        }
        return Second_Smallest;
    }
}