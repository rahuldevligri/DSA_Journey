/* Find Secound Largest Element in an array? */
package Arrays;

public class Q5_SecoundLargestElement {
    public int secoundLargestElement(int[] arr){
        int max = arr[0];
        int secMax = arr[1];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,2,2,6};
        int targetElement = 2;
        Q5_SecoundLargestElement q5 = new Q5_SecoundLargestElement();
        System.out.println("2nd Largest Element: " + q5.secoundLargestElement(arr));
    }
}
