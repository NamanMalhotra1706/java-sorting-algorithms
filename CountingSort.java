import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] ages = {12, 15, 14, 18, 13, 12, 11, 16, 15, 17, 10};

        System.out.println("Original Ages:");
        System.out.println(Arrays.toString(ages));

        int minAge = 10, maxAge = 18;
        ages = countingSort(ages, minAge, maxAge);

        System.out.println("Sorted Ages:");
        System.out.println(Arrays.toString(ages));
    }

    public static int[] countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range]; // Frequency array
        int[] output = new int[arr.length];

        // Count occurrences of each age
        for (int num : arr) {
            count[num - min]++;
        }

        // Compute cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        return output;
    }
}
