// O(n)
public class array_product_except_self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        int prevsuffix = 1;
        for (int i = n-2; i >= 0; i--) {
            prevsuffix *= nums[i+1];
            ans[i] *= prevsuffix;
        }
        return ans;
        // int prod = 1;
        // boolean zeropresent = false;
        // int countzeros = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         prod *= nums[i];
        //     } else {
        //         zeropresent = true;
        //         countzeros++;
        //     }
        // }
        // int[] ans = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     if (!zeropresent) {
        //         ans[i] = prod / nums[i];
        //     } else {
        //         if (nums[i] != 0 || countzeros == nums.length) {
        //             ans[i] = 0;
        //         } else {
        //             ans[i] = prod / 1;
        //         }
        //     }
        // }
        // return ans;
    }
}