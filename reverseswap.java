import java.util.Arrays;

public class reverseswap {
    void main()
    {
        int arr[]={1,5,4,55,2};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[])
    { 
        int start=0;
        int end=arr.length-1;
        while(start < end)
        {
            swapit(arr,start, end);
            start++;
            end--;
        }
    }
    static void swapit(int arr[], int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

    }
