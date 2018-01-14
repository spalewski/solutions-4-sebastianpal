package pl.coderstrust.mySimpleLinkedList;

import java.util.List;

public class MySimpleLinkedListTest extends MySimpleLinkedListTestBase {
    @Override
    public List getList() {
        return new MySimpleLinkedList<>();
    }
}
