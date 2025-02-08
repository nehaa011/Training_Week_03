//Problem Statement: 2
//A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.


import java.util.Scanner;

public class InsertionSort {

    public static void sortEmployeeIDs(int[] arr){
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0 ; j--){
                if(arr[j]< arr[j-1]){
                    temp= arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
                else{
                    break;
                }
            }
        }
    }


    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int[] arr= {1022, 1054, 1048, 1087, 1092};

        System.out.println("Employee IDs before sorting:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sortEmployeeIDs(arr);
        System.out.println("Employee IDs after sorting:");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
