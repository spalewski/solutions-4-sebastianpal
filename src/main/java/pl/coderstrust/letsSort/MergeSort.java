package pl.coderstrust.letsSort;

public class MergeSort {

    private static final int N = 30;
    private static int tab[] = {30, 29, 28, 27, 26, 25, 1, 2, 3, 4, 5, 6, 7, 24, 23, 22, 21, 20, 19, 18, 8, 9, 10, 11, 17, 16, 15, 13, 14, 12};
    private static int t[] = new int[ N ];

    private static void merge(int start, int middle, int end) {
        int i, j, q;
        for (i = start; i <= end; i++) t[ i ] = tab[ i ];
        i = start;
        j = middle + 1;
        q = start;
        while (i <= middle && j <= end) {
            if (t[ i ] < t[ j ])
                tab[ q++ ] = t[ i++ ];
            else
                tab[ q++ ] = t[ j++ ];
        }
        while (i <= middle) tab[ q++ ] = t[ i++ ];
    }

    public static void mergesort(int start, int end) {
        int sr;
        if (start < end) {
            sr = (start + end) / 2;
            mergesort(start, sr);
            mergesort(sr + 1, end);
            merge(start, sr, end);
        }
    }

    public static void main(String[] args) {
        int i;

        System.out.println("Zbior przed sortowaniem:");
        for (i = 0; i < N; i++)
            System.out.print(tab[ i ] + " ");

        mergesort(0, N - 1);

        System.out.println("\nZbior po sortowaniu:");
        for (i = 0; i < N; i++)
            System.out.print(tab[ i ] + " ");
    }
}