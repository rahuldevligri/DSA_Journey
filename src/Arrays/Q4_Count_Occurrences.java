/* Count Occurrences of an element */
package Arrays;

public class Q4_Count_Occurrences {
    public int countOccurrences(int[] arr, int targetElement){
        int cnt = 0;
        for (int j : arr)
            if (j == targetElement) cnt++;
        return cnt;
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
    public static void main(String[] args){
        int[] arr = {1,2,4,2,2,6};
        int targetElement = 2;
        Q4_Count_Occurrences q4 = new Q4_Count_Occurrences();
        System.out.println("occurrences of " + targetElement + " is "+ q4.countOccurrences(arr, targetElement));
    }
}
