/* Reverse an Array */
package Arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_ReverseArray {
    public int[] reverseArray(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length / 2;i++){
            temp = arr[0];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        //define and initialize an array
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter element at " + i+1 + ": ");
            arr[i] = sc.nextInt();
        }
        Q02_ReverseArray q2 = new Q02_ReverseArray();
        System.out.println(Arrays.toString(q2.reverseArray(arr)));
    }
}
