public class max
{ 
    public static void main(String args[])
    {
        int arr[]={1,2,14,158,5,14};
        System.out.println(maxx(arr));
    }

    static int maxx(int arr[])
    {
        int maxVal=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>maxVal)
            {
                maxVal=arr[i];
            }
        }

            return maxVal;

    }
    
}
