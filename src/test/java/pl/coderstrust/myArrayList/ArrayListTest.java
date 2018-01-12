package pl.coderstrust.myArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest extends AbstractListTest {

    @Override
    public List getList() {
        return new ArrayList();
    }
}