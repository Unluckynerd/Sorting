package sort;

public class Main {
    public static void main(String[] args) {
        array obj = new Bubblesort();
        array obj1 = new InsertionSort();
        Test Binary = new Test();
        int a[] = {3, 7, 98, 12, 4, 1};
        int b[] = {34, -1, 5, 23, 99, 8};
        System.out.println(Binary.search(obj, a, 5));
        System.out.println(Binary.search(obj1, b, 5));
    }
}
