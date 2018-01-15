package pl.coderstrust.mySimpleLinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest extends MySimpleLinkedListTestBase {
    @Override
    public List getList() {
        return new LinkedList();
    }
}
