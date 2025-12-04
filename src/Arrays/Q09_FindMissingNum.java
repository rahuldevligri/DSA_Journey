/* Find missing number form 1 to N */
package Arrays;

public class Q09_FindMissingNum {
    public static int findMissing(int[] arr, int N){
        int total = N * (N + 1) / 2;// 5 * (5+1) / 2 -> 5 * 6 / 2 -? 30 / 2 = 15

        int sum = 0;
        for(int num : arr){
            sum += num; //0+1=1, 1+2=3,3+4=7,7+5=12
        }

        return total - sum;//15-12=3
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5};
        int N = 5;
        System.out.println("Missing number: " + findMissing(arr, N));
    }
}
