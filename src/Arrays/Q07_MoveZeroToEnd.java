package Arrays;

public class Q07_MoveZeroToEnd {
    private static int[] move0ToEnd(int[] arr){
        int index = 0; //O(1)
        for(int i = 0; i < arr.length; i++){// O(n)
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < arr.length){ //O(n)
            arr[index] = 0;
            index++;
        }
        return arr;
    } //⭐ Time Complexity = O(n) & ⭐ Space Complexity = O(1)
    public static void main(String[] arg){
        int[] arr = {0,12, 0, 45, 23, 0};
        for(int a : move0ToEnd(arr)){
            System.out.print(a + "\t");
        }
    }
}
