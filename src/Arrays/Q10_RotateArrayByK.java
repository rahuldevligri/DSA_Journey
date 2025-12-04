/* Rotate Array by K position? */
package Arrays;

import java.util.Arrays;

public class Q10_RotateArrayByK {
    //type1
    private static int[] rotateArray(int[] arr, int k){
        int[] arr2 = new int[k];
        //create new array put k rotated element
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = arr[(arr.length - k) + i];
        //rotate array
        for (int i = arr.length - 1; i >= k; i--)
            arr[i] = arr[i - k];
        //add k element into array
        for (int i = 0; i < arr2.length; i++)
            arr[i] = arr2[i];
        return arr;
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(k)
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;
        if(k <= arr.length){
            for(int a :rotateArray(arr, k))
                System.out.println(a + "\t");
        } else{
            System.out.println("k can not be greater than arr length");
        }
    }
    //Type-2
    // function to reverse part of array
    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n; // handle cases where k > n

        // Step 1: reverse entire array
        reverse(arr, 0, n - 1);

        // Step 2: reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: reverse remaining n-k elements
        reverse(arr, k, n - 1);
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
}
