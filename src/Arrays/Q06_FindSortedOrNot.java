/* check array is sorted or not */
package Arrays;

public class Q06_FindSortedOrNot {
    private boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++)
            if(arr[i+1] < arr[i])
                return false;
        return true;
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        Q06_FindSortedOrNot q6 = new Q06_FindSortedOrNot();
        System.out.println(q6.isSorted(arr));
    }
}
