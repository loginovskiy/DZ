package ru.vyacheslav.lessons.quicksort;

public class Qs
{
    int[] array;
    int l,r;
    int op, temp;
    public void quicksort(int[] arr)
    {
        qs(arr, 0, arr.length-1);
    }
    private void qs(int[] arr, int left, int right)
    {
        this.array=arr;
        l=left;
        r=right;
        op=array[(left+right)/2];
        do
        {
            while((array[l]<op) && (l<right))l++;
            while((array[r]>op) && (r>left))r--;
            if(l<=r)
            {
                temp=array[l];
                array[l]=array[r];
                array[r]=temp;
                r--;
                l++;
            }
        }while(l<=r);
        if(r>left)qs(array, left, r);
        if(l<right)qs(array, l, right);
    }
}
