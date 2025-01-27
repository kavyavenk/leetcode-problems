import java.util.Arrays;

public class smallest_missing_positive_number {
    static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == res) {
                res++;
            }
            else if (arr[i] > res) {
                break;
            }
        }
        return res;
    }
}
