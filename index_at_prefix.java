public class index_at_prefix {

    public static int peakIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;   // peak right me hai
            } else {
                right = mid;      // peak left me hai
            }
        }

        return left;  // peak index
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        System.out.println("Peak index: " + peakIndex(arr));
    }
}
