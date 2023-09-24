public class QuickSort {
    public static int[] quickSort(int[] arr) {
        int pivot = arr[0];

        int low = 0;
        int high = arr.length - 1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i+1] <= pivot) {
                low++;

            }
            if(arr[high] > pivot) {
                high--;
            }
        }

    }
}
