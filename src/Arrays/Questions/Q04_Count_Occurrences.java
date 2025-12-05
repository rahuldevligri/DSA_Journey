/* Count Occurrences of an element */
package Arrays.Questions;

public class Q04_Count_Occurrences {
    public int countOccurrences(int[] arr, int targetElement){
        int cnt = 0;
        for (int j : arr)
            if (j == targetElement) cnt++;
        return cnt;
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
    public static void main(String[] args){
        int[] arr = {1,2,4,2,2,6};
        int targetElement = 2;
        Q04_Count_Occurrences q4 = new Q04_Count_Occurrences();
        System.out.println("occurrences of " + targetElement + " is "+ q4.countOccurrences(arr, targetElement));
    }
}
