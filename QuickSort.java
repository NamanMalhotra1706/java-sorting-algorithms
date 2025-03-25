import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        double[] prices = {299.99, 149.99, 499.99, 99.99, 199.99};

        System.out.println("Original Prices:");
        System.out.println(Arrays.toString(prices));

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Prices:");
        System.out.println(Arrays.toString(prices));
    }

    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high]; // Choosing the last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
