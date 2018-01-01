package pl.coderstrust.hoarePartition;

public class Main {

    public static void main(String[] args) {
        int[] arrayTest = {1, 7, 9, 4, 3, 2, 8, 5};
        HoarePartition hoarePartition = new HoarePartition();

        for (int i = 0; i < arrayTest.length; i++) {
            System.out.println(HoarePartition.horaeSorter(arrayTest, 4)[ i ]);
        }
    }
}
