
// return list without passing it to argument 
import java.util.ArrayList;

public class list {
    public static void main(String args[]) {

        int arr[] = { 2, 3, 1, 4, 4, 5 };
        System.out.println(findallIndex2(arr, 4, 0));

    }

    static ArrayList<Integer> findallIndex2(int arr[], int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findallIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;

    }
}