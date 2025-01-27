import java.util.Scanner;

class find_peak_arr{
	public static void main(String[] args){
		// create obj of Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Define Array Size Here : ");
		int size = sc.nextInt();
		
		
		int[] arr = new int[size];
		
		// Insert Elements on the Arrays 
		System.out.println("You can Store Elements As a size of the arrays ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Arrays Largest Peak is : ");
		int ans = find_peak_array(arr);
		System.out.print(ans);

		sc.close();
	}
	
	// create one method to short the arrays elements
	public static int find_peak_array(int[] arr){
		if(arr.length != arr.length){
			return -1;
		}
		
		// first short the elements of arrays 
		int temp=0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;

	}
}