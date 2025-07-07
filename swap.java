
//swap
import java.util.*;

public class swap {
    void main() {
        int arr[] = { 12, 11, 13, 14, 15 };
        swapit(arr, 0, 1);

        System.out.println(Arrays.toString(arr));

    }

    static void swapit(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}
