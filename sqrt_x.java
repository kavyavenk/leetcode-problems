class sqrt_x {
    public int mySqrt(int x) {
        // i use binary search for this
        if (x < 2) {
            return x; 
        }
        int left = 1;
        int right = x / 2;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
// runtime O(log n)