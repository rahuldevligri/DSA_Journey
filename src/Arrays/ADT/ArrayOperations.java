package Arrays.ADT;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //tanke size of the array form user
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        //create an object of ArrayADTImpl class and pass the array size
        ArrayADT array = new ArrayADTImpl(size);

        //insert value into array
        System.out.println("Insert value in the Array: ");
        for(int i = 0; i<size;i++){
            System.out.print("Enter value at " + (i+1) + " position: ");
            array.insert(sc.nextInt());
        }

        //get size of the array.
        System.out.println("Array size: " + array.getSize());

        //traverse the array one by one
        array.traverse();

        //search values index
        System.out.print("Enter value to search index: ");
        int value = sc.nextInt();
        int searchIndex = array.search(value);
        System.out.println("Search index of " + value + " : " + searchIndex);

        //delete
        System.out.println("Enter the index to delete value: ");
        array.delete(sc.nextInt());
        //traverse the array
        array.traverse();
    }
}
