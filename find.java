
// 1d array linear search 
import java.util.*;

public class find {
    void main() {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        int size = sc.nextInt();
        // int[] arr=new int[size];
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("x found at index:" + i);
            }
        }
        sc.close();
    }
}
