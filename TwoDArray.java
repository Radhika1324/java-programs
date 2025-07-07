// 2d array element search
import java.util.*;
public class TwoDArray 
{
    void main()
    {
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]= new int[rows][cols];
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
            int x= sc.nextInt();
            for (int i=0; i<rows; i++)
            {
                for(int j=0; j<cols; j++)
                {
                    if(arr[i][j]==x)
                    {
                        System.out.println("x is found at location ("+ i +" , "+ j +")");
                    }
                }
            }
    
        sc.close();
    
    }

    
}
