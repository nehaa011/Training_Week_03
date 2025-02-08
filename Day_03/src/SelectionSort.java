//Problem Statement 5:
//A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.


import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    static void selectionSort(int[] arr){
        int n= arr.length;

        for(int i=0; i<n; i++){
            int minIndex=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp= arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        int n= sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter students score: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Students exam scores: "+ Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("students exam scores in ascending order:");
        System.out.println(Arrays.toString(arr));
    }
}
