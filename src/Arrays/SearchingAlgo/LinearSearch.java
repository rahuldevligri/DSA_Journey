package Arrays.SearchingAlgo;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    } // ⭐ Best Case — O(1) || ⭐ Worst Case — O(n) || ⭐ Average Case — O(n)
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
        int index = linearSearch(arr, target);
        if(index == -1){
            System.out.println("Element not fount...");
        } else {
            System.out.println("Element found at: "+index);
        }
    }
}
