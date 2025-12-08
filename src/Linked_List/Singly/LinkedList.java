/* ✅ Time Complexity Check:
    insertAtBeginning   → O(1) ✔️
    insertAtEnd         → O(n) ✔️
    insertAtPosition    → O(n) ✔️
    printData           → O(n) ✔️
    deleteAtBeginning   → O(1) ✔️
    deleteAtEnd         → O(n) ✔️
    deleteAtPosition    → O(n) ✔️
    searchData          → O(n) ✔️
 */
package Linked_List.Singly;

public class LinkedList {
    // head ek reference hai, jo abhi kisi node ko point nahi kar raha (empty list)
    Node head = null;

    // 1. Insert at the beginning
    // Time Complexity: O(1) -> does not depend on the length of the list
    public void insertAtBeginning(int item){
        // Step 1: naya node create kiya, jisme data = item, next = null
        Node newNode = new Node(item);
        // Step 2: agar head null hai, iska matlab list empty hai
        if (head == null) {
            // head ab is newNode ko point karega (head ke andar newNode ka address store hoga)
            head = newNode;
            return;
        }
        // Step 3: newNode ka next purane head ki taraf point karega
        // yaha "head" ek address hai, aur wo address newNode.next me copy ho raha hai
        newNode.next = head;
        // Step 4: ab head ko newNode ki taraf point kara diya (newNode ka address head me aa gaya)
        head = newNode;
    }
    // 2. Insert at the end
    //Time Complexity: O(n) -> operation depends on the length of list:
    public void insertAtEnd(int item){
        // Step 1: new node create kiya — data = item, next = null
        Node newNode = new Node(item);
        // Step 2: agar head null hai toh list empty hai
        // isliye pehla node newNode hi ban jata hai, head usi ko point karega
        if(head == null){
            head = newNode; // head me newNode ka address store hua
            return;
        }
        // Step 3: temp ko head par set kiya
        // temp ek pointer hai jo list ke nodes ko traverse karega
        Node temp = head;
        // Step 4: temp ko aage badhate jayenge jab tak last node ka next null na mil jaye
        while(temp.next != null){
            temp = temp.next;  // temp ab next node ka address store karega
        }
        // Step 5: ab temp last node par hai (temp.next == null)
        // last node ke next me newNode ka address daal diya → new node last me attach ho gaya
        temp.next = newNode;
    }
    // 3. Insert at a specific position (0-based index)
    // Time Complexity: O(n) -> depend length of the list
    public void insertAtPosition(int item, int position){
        //new node created to insert
        Node newNode = new Node(item);
        //to check invalid position
        if(position < 0){
            System.out.println("Invalid Position");
            return;
        }
        // If position is 0, insert at the beginning
        if(position == 0){
            newNode.next = head; // नया node पुराने head की तरफ point करेगा
            head = newNode;      // head अब newNode को point करेगा
            return;
        }
        // Move temp to the node at (position - 1)
        Node temp = head;
        int index = 0;
        // temp को उस node तक ले जाना है जो (position - 1) पर है
        while(temp != null && index < position-1){
            temp = temp.next;
            index++;
        }
        // agar temp null ho gaya: matlab list khatam ho gayi, position bada hai
        if(temp == null){
            System.out.println("Position out of the bond");
            return;
        }
        // Insert newNode between temp and temp.next
        newNode.next =  temp.next;
        temp.next = newNode;
    }

    // 4. Print all elements of the list
    // Time Complexity: O(n) -> depends on the length of the list.
    public  void printData(){
        if(head == null){
            System.out.println("LinkedList is empty!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //delete operations
    // 5. Delete from the beginning
    // Time Complexity: O(1) -> doesn't depend on length of list.
    public void deleteAtBeginning(){
        if (head == null) {
            System.out.println("List is empty !! no nodes to delete");
            return;
        }
        // Move head to the next node; old head will be garbage collected
        this.head = this.head.next;
    }
    // 6. Delete from the end
    // Time Complexity: O(n) -> need to reach the second-last node.
    // operations: depends on the length of the list.
    public void deleteAtEnd(){
        if (head == null) {
            System.out.println("List is empty !! no nodes to delete");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        // Move temp to the second-last node
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null; // Remove the last node
    }

    // 7. Delete at a specific position (0-based index)
    // Time Complexity: O(n)
    public void deleteAtPosition(int position){
        if (head == null) {
            System.out.println("List is empty !! no nodes to delete");
            return;
        }
        // If we want to delete the head node
        if(position == 0){
            head = head.next;
            return;
        }
        // Move temp to (position - 1)
        Node temp = head;
        int index = 0;
        while(temp != null && index < position - 1){
            temp = temp.next;
            index++;
        }
        if(temp == null || temp.next == null){
            System.out.println("Position is out of bound!!");
            return;
        }
        temp.next = temp.next.next; // Skip the node at 'position'
    }
    // 8. Search if a value exists in the list or not
    // Time Complexity: O(n) -> may need to check every node
    public boolean searchData(int data){
        if(head.data == data){
            return true;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

