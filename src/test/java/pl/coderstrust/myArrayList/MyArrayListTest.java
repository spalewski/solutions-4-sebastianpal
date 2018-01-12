package pl.coderstrust.myArrayList;

import java.util.List;

public class MyArrayListTest extends AbstractListTest {

    @Override
    public List getList() {
        return new MyArrayList<>();
    }
}