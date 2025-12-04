/* Find Secound Largest Element in an array? */
package Arrays;

public class Q05_SecoundLargestElement {
    public int secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secMax = max;
                max = num;
            } else if (num > secMax && num < max) {
                secMax = num;
            }
        }
        return secMax;
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
    public static void main(String[] args){
        int[] arr = {1,2,4,2,2,6};
        int targetElement = 2;
        Q05_SecoundLargestElement q5 = new Q05_SecoundLargestElement();
        System.out.println("2nd Largest Element: " + q5.secondLargestElement(arr));
    }
}
