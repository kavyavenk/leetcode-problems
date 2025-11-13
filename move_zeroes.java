public class move_zeroes {
    public void moveZeroes(int[] nums) {
        // using snowball approach
        int snowballSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowballSize++;
            } else if (snowballSize > 0) { 
                // swap zero(s) and the number right after them
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowballSize] = temp;
            }
        }
    }
}
