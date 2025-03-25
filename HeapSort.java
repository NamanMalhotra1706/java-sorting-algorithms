import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        double[] salaries = {55000, 75000, 50000, 90000, 65000};

        System.out.println("Original Salary Demands:");
        System.out.println(Arrays.toString(salaries));

        heapSort(salaries);

        System.out.println("Sorted Salary Demands:");
        System.out.println(Arrays.toString(salaries));
    }

    public static void heapSort(double[] arr) {
        int n = arr.length;


        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }


        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    public static void heapify(double[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    public static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
