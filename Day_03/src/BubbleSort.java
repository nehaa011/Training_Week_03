//Problem Statement: 1
// A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.


import java.util.Scanner;

public class BubbleSort {

    public static void SortStudentMark(int[] arr){
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    temp=arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
        return;
    }


    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n= input.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter the marks of students:");
        for(int i=0; i<arr.length; i++){
            arr[i]= input.nextInt();
        }

        System.out.println("Marks before sorting:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        SortStudentMark(arr);
        System.out.println("Marks after sorting:");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
