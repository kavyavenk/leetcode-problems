// Given an integer array, return the “pivot” index where 
// the sum of all elements to the left equals the sum of all elements to the right. 
// If no such index exists, return -1. 
// (For example, [1,7,3,6,5,6] → pivot at index 3, because left sum = 11, right sum = 11.)
// time O(n) space O(1)
public class pivot_index {
    public int pivotindex (int[] nums) {
        // finding total sum
        int totalsum = 0;
        for (int num : nums) {
            totalsum += num;
        }
        // introducing a pivot
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == totalsum - leftsum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}
