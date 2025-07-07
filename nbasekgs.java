import java.util.*;

public class nbasekgs {
    public static int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            int r = n % k;
            sum = sum + r;
            n = n / k;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = sumBase(n, k);
        System.out.println(result);
        sc.close();

    }

}
