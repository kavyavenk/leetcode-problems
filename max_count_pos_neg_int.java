public class max_count_pos_neg_int {
    public int maximumCount(int[] nums) {
        int p = 0, n = 0;
        for (int num : nums) {
            if (num > 0) p++;
            else if (num < 0) n++;
        }
        return Math.max(p,n);
    }
}