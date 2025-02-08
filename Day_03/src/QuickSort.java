//Problem Statement 4:
//An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.

import java.util.Scanner;

public class QuickSort {

    static int partition(int arr[], int low , int high){
        int pivot= arr[high];
        int i=low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp= arr[j];
                arr[j]= arr[i];
                arr[i]=temp;

            }
        }

        int temp= arr[i+1];
        arr[i+1] =arr[high];
        arr[high]= temp;

        return i+1;
    }

    static void quickSort(int arr[], int low, int high){
        if(low<high){
            int partition= partition(arr , low, high);
            quickSort(arr,low, partition-1);
            quickSort(arr, partition+1, high);

        }
    }

    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number of product: ");
        int n= sc.nextInt();

        System.out.println("Enter the product price: ");
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n-1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
