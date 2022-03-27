package Sorting;

public class InsertionSort implements Arrays{
    @Override
    public void sort(int[] a) {
        for(int i = 0 ; i < a.length - 1 ; i++)
        {
            for(int j = i + 1 ; j > 0 ; j--)
            {
                if(a[j - 1] > a[j])
                {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
