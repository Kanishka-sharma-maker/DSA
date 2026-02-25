/*public class prefixsum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print prefix sum array
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}*/
//given an array of n integer and q queries where each query consists of two indices(L,R),return the sum of elements from index L to R
import java.util.Scanner;

public class prefixsum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.print("Enter L and R: ");
            int L = sc.nextInt();
            int R = sc.nextInt();

            int sum;
            if (L == 0) {
                sum = prefix[R];
            } else {
                sum = prefix[R] - prefix[L - 1];
            }

            System.out.println("Sum = " + sum);
        }

        sc.close();
    }
}

