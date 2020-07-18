import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    public static void main(String[] args){
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();

    }

//    @Test
//    void add() {
//    }
//
//    @Test
//    void addFirst() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void get() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void printList() {
//    }
}