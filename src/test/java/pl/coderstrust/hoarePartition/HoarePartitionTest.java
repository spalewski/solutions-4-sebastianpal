package pl.coderstrust.hoarePartition;

        import org.junit.Assert;
        import org.junit.Test;

public class HoarePartitionTest {
    int[] testArray = {1, 7, 9, 4, 3, 2, 8, 5};
    int pivotPosition = 3;
    int[] sortedArray = HoarePartition.horaeSorter(testArray, pivotPosition);

    @Test
    public void checkPartitions() {
        Assert.assertTrue(sortedArray[ 0 ] < testArray[ pivotPosition ]);
        Assert.assertTrue(sortedArray[ 1 ] < testArray[ pivotPosition ]);
        Assert.assertTrue(sortedArray[ 2 ] < testArray[ pivotPosition ]);
        Assert.assertTrue(sortedArray[ 3 ] == testArray[ pivotPosition ]);
        Assert.assertTrue(sortedArray[ 4 ] > testArray[ pivotPosition ]);
        Assert.assertTrue(sortedArray[ 5 ] > testArray[ pivotPosition ]);
        Assert.assertTrue(sortedArray[ 6 ] > testArray[ pivotPosition ]);
        Assert.assertTrue(sortedArray[ 7 ] > testArray[ pivotPosition ]);
    }

    @Test
    public void checkArraysLenght() {
        Assert.assertEquals(testArray.length, HoarePartition.horaeSorter(testArray, pivotPosition).length);
    }
}