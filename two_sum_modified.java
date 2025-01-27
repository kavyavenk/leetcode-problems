// optimized O(n) using hashmap implementation
import java.util.*;
public class two_sum_modified {
    public int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // finding  a complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // checking if complement is in map
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {map.get(complement), i}; // the key-value pair
            }
            // otherwise storing the current value and index
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
