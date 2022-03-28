package sort;

public class Test{

    public boolean search(array obj, int a[],int target)
    {
        obj.sort(a);
        return sarch(a,0,a.length ,target);
    }

    public boolean sarch(int a[], int first , int last,int target){
        int mid;
        if(last >= first)
        {
            mid = (first + last)/2;
            if(a[mid] == target)
            {
                return true;
            }
            else if(a[mid] < last)
            {
                return sarch(a, mid + 1, last, target);
            }
            else
            {
                return sarch(a, first, mid - 1, target);
            }
        }
        return false;
    }
}
