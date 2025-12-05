package Arrays.ADT;

public interface ArrayADT {
    //insert
    void insert(int value);

    //delete
    void delete(int deleteIndex);

    //search the element and return the index value
    int search(int value);

    //get the data
    int get(int getIndex);

    //traverse
    void traverse();

    //update
    void update(int updateIndex, int value);

    //get the size
    int getSize();
}
