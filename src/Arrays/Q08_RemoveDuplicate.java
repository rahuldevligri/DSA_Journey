/* remove duplicate element form an sortedArray */
package Arrays;
import java.util.Arrays;

public class Q08_RemoveDuplicate {
    private static int[] removeDuplicate(int[] arr){
        if (arr == null || arr.length == 0) return new int[0];

        int index = 1; // next write position
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return Arrays.copyOf(arr, index); // unique prefix
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
    public static void main(String[] arg){
        int[] arr = {1,1,2,3,3,4,5,5};
        for(int a : removeDuplicate(arr)){
            System.out.print(a + "\t");
        }
    }
}
