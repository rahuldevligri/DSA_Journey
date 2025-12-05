/* remove duplicate element form an sortedArray */
package Arrays.Questions;

public class Q08_RemoveDuplicate {
    private static void removeDuplicate(int[] arr){
        int j = 0;
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] != arr[i+1])
                arr[j++] = arr[i];
        }
        arr[j++] = arr[arr.length-1];
        for(int i = 0; i < j; i++){
            System.out.print(arr[i] + " ");
        }
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
    public static void main(String[] arg){
        int[] arr = {1,1,2,3,3,4,5,5};
        removeDuplicate(arr);
    }
}
