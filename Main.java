package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int a[] = {4, 9, 2, 12, 6, 3, 1};
        Array obj= new BubbleSort();
        obj.sort(a);
        System.out.println(Arrays.toString(a));
        int b[] = {5,32,-1,64,2,10};
        Array obj2 = new InsertionSort();
        obj2.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
