package sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a[] = { 3,7,98,12,4,1};
        int b[] = {34,-1,5,23,99,8};
        test Arrays = new test();
        Arrays.sort(new Bubblesort(),a);
        Arrays.sort(new InsertionSort(),b);
        System.out.println(java.util.Arrays.toString(a));
        System.out.println(java.util.Arrays.toString(b));
    }
}
