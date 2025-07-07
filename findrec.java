// linear search by recursion

import java.util.ArrayList;

public class findrec {
     public static void main(String args[])
     {
        int arr[]={2,3,1,4,4,5};
        System.out.println( find(arr, 5,0));
        System.out.println(findIndex(arr, 4,0));
        list.clear();
        findallIndex(arr, 4,0);
        System.out.println(list);
    }
     static boolean find(int arr[], int target, int index)
     {
        if ( index== arr.length)
        {
            return false;
        }
        return arr[index]==target || find( arr, target, index+1);
     }

     static int findIndex(int arr[], int target, int index)
     {
        if ( index== arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
         else {
            return findIndex( arr, target, index+1);
         }
     }

     static ArrayList<Integer> list= new ArrayList<>();
     static void findallIndex(int arr[], int target, int index)
     {
        if ( index== arr.length)
        {
            return;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
            findallIndex( arr, target, index+1);
         
     }
    
}
