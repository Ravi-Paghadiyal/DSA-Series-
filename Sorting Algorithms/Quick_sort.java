public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 4, 3, 0, -1, -2};
        quick_sorting(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quick_sorting(int[] arr, int st, int ed) {
        if (st >= ed) {
            return;
        }

        int start = st;
        int end = ed;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            // Move left pointer until a larger element is found
            while (arr[start] < pivot) {
                start++;
            }

            // Move right pointer until a smaller element is found
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                // Swap elements at start and end
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Recursively sort left and right parts
        quick_sorting(arr, st, end);
        quick_sorting(arr, start, ed);
    }
}
