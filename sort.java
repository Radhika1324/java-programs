public class sort {
    public static void main()
    {
        int arr[]={1,5,4,3};
        System.out.println(sorted(arr, 0));
    }
    static boolean sorted(int arr[], int index)
    {
        if( index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1]&& sorted(arr, index+1);
    }

    
}
