//SubarrayMaxSum in array
public class SubarrayMaxSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 2, 3, 4, 5 };

        int maxSum = Integer.MIN_VALUE;
        for (int st = 0; st < n; st++) {
            int currSum = 0;
            for (int end = st; end < n; end++) {
                currSum += arr[end];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println("max subarray sum=" + maxSum);
    }
}
