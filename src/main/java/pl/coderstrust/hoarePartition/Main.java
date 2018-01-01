package pl.coderstrust.hoarePartition;

public class Main {

    public static void main(String[] args) {
        int[] arrayTest = {1, 7, 9, 4, 3, 2, 8, 0};
        HoarePartition hoarePartition = new HoarePartition();
        System.out.println(HoarePartition.hoarePartitioning(arrayTest,4)[0]);
        System.out.println(HoarePartition.hoarePartitioning(arrayTest,4)[1]);
        System.out.println(HoarePartition.hoarePartitioning(arrayTest,4)[2]);
        System.out.println(HoarePartition.hoarePartitioning(arrayTest,4)[3]);
        System.out.println(HoarePartition.hoarePartitioning(arrayTest,4)[4]);
        System.out.println(HoarePartition.hoarePartitioning(arrayTest,4)[5]);
        System.out.println(HoarePartition.hoarePartitioning(arrayTest,4)[6]);
        System.out.println(HoarePartition.hoarePartitioning(arrayTest,4)[7]);


    }
}
