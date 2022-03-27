package Sorting;

public class BubbleSort implements Arrays{

    @Override
    public void sort(int[] a) {
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int  j = i + 1 ; j <= a.length - 1 ; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
