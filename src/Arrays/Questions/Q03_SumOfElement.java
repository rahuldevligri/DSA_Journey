/* SUm of element in an Array */
package Arrays.Questions;

import java.util.Scanner;

public class Q03_SumOfElement {
    public int sum(int[] arr){
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        return sum;
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
        Q03_SumOfElement q3 = new Q03_SumOfElement();
        System.out.println("Sum: " + q3.sum(arr));
    }
}
