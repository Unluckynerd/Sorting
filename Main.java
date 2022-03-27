package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        InsertionSort i = new InsertionSort();
        int a[] = {4,9,2,12,6,3,1};
        b.sort(a);
        System.out.println(Arrays.toString(a));
        int c[] = {14,34,63,1,13,4};
        i.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
