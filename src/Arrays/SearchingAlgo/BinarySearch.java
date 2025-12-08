package Arrays.SearchingAlgo;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int pass = 1;
        while(start <= end){
            System.out.println("Pass: " + pass++);
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        //define and initialize an array
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter " + (i+1) +"  element: " );
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter search element: ");
        int target = sc.nextInt();
        int index = binarySearch(arr, target);
        if(index == -1){
            System.out.println("Element not fount...");
        } else {
            System.out.println("Element found at: "+index);
        }
    }
}
