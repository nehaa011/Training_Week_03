import java.util.Arrays;

public class MergeSort{


    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};

        merge(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void merge(int arr[], int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2; //l + (h - l) / 2;

            merge(arr, left, mid);  //first part
            merge(arr, mid + 1, right); // second part
            mergesort(arr, left, mid, right);
        }
    }

    static void mergesort(int arr[], int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int g = 0;
        int c[] = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                c[g] = arr[i];
                g++;
                i++;
            } else {
                c[g] = arr[j];
                g++;
                j++;
            }
        }

        while (i <= mid) {
            c[g] = arr[i];
            g++;
            i++;
        }
        while (j <= right) {
            c[g] = arr[j];
            g++;
            j++;
        }
    }
}