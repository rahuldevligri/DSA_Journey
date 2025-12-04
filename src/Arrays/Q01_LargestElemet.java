/* Find the largest element in an array? */
package Arrays;

import java.util.Scanner;

public class Q01_LargestElemet {
    public int findLargestELemet(int[] arr){
        int max = arr[0];
        for (int i : arr)
            if (max < i)
                max = i;
        return max;
    } //⭐ Time Complexity = O(n)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array: ");
        int size = sc.nextInt();
        //define and initialize an array
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter element at: " + i+1);
            arr[i] = sc.nextInt();
        }
        Q01_LargestElemet q1 = new Q01_LargestElemet();
        System.out.println("Largest ELement: " + q1.findLargestELemet(arr));
    }
}
