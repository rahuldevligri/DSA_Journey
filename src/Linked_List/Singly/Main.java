package Linked_List.Singly;

import java.util.Scanner;

public class Main {
    public static void printMenu(){
        System.out.println("**********MENU**********");
        System.out.println("Enter 1 to INSERT");
        System.out.println("Enter 2 to DELETE");
        System.out.println("Enter 3 to SEARCH");
        System.out.println("Enter 4 to DISPLAY");
        System.out.println("Enter 5 to EXIT");
        System.out.println("Enter your choice??");
        System.out.println("************************");
    }
    public static void printInsertMenu(){
        System.out.println("Press 1 to insert from HEAD");
        System.out.println("Press 2 to insert from TAIL");
        System.out.println("Press 3 to insert at specific Position");
    }
    public static void printDeleteMenu(){
        System.out.println("Press 1 to delete from HEAD");
        System.out.println("Press 2 to delete from TAIL");
        System.out.println("Press 3 to delete at specific Position");
    }
    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.insertAtBeginning(12);
//        linkedList.insertAtEnd(13);
//        linkedList.insertAtEnd(908);
//        linkedList.insertAtEnd(1232);
//        linkedList.insertAtPosition(10,1);
//        linkedList.printData();
////        linkedList.deleteAtBeginning();
////        linkedList.printData();
////        linkedList.deleteAtEnd();
////        linkedList.printData();
//        linkedList.deleteAtPosition(0);
//        linkedList.printData();
        System.out.println("******Welcome to LinkedList App******");
        //data structure implemented...
        LinkedList linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                printMenu();
                //read the couice;
                int choice = sc.nextInt();
                if (choice == 1){
                    //insert op
                    insertLinkedList(linkedList);
                } else if (choice == 2){
                    //delete op
                    deleteFromLinkedList(linkedList);
                } else if (choice == 3){
                    //search op
                    System.out.print("Enter the data you want to search? ");
                    int data = sc.nextInt();
                    boolean result = linkedList.searchData(data);
                    if(result){
                        System.out.println("Yes, data is present in list");
                    } else {
                        System.out.println("Data is not present in list");
                    }
                } else if (choice == 4) {
                    linkedList.printData();
                } else if (choice == 5){
                    //exit
                    System.out.println("Thank you for using App");
                    break;
                } else{
                    System.out.println("Invalid Choice!!");
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void insertLinkedList(LinkedList linkedList) {
        printInsertMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Insert Choice?? ");
        int insertChoice = scanner.nextInt();
        if(insertChoice ==1){
            System.out.print("Enter your data: ");
            linkedList.insertAtBeginning(scanner.nextInt());
            System.out.println("Success!!");
        } else if (insertChoice == 2) {
            System.out.print("Enter your data: ");
            linkedList.insertAtEnd(scanner.nextInt());
            System.out.println("Success!!");
        } else if (insertChoice == 3) {
            System.out.print("Enter position: ");
            int position = scanner.nextInt();
            System.out.print("Enter your data: ");
            int data = scanner.nextInt();
            linkedList.insertAtPosition(data, position);
            System.out.println("Success!!");
        } else {
            System.out.println("Invalid Choice!!");
        }

    }

    private static void deleteFromLinkedList(LinkedList linkedList) {
        printDeleteMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Delete Choice?? ");
        int deleteChoice = scanner.nextInt();
        if(deleteChoice==1){
            linkedList.deleteAtBeginning();
            System.out.println("Deleted...");
        } else if (deleteChoice == 2) {
            linkedList.deleteAtEnd();
            System.out.println("Deleted...");
        } else if (deleteChoice == 3) {
            System.out.print("Enter the position: ");
            int position = scanner.nextInt();
            linkedList.deleteAtPosition(position);
            System.out.println("Deleted...");
        } else{
            System.out.println("Invalid Choice!!");
        }
    }
}
