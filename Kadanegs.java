import java.util.*;

public class Kadanegs {
    public static int userLogic(List<Integer> nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int j = 0; j < nums.size(); j++) {
            currSum += nums.get(j);
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum; // Placeholder return value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        int result = userLogic(nums);
        System.out.println(result);
        sc.close();
    }

}