class top_k_frequent_elements {
    public int[] topKFrequent(int[] nums, int k) {
        // bucket sort
        // 1. build freq map w #times char appears
        Map<Integer, Integer> count = new HashMap<>();
        // 2. list of groups where freq[i] : all nos appearing i times
        List<Integer>[] freq = new List[nums.length + 1];
        // 3. for each no and frequency in map, add no to freq[frequency]
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }
        // 4. init empty result list
        int[] res = new int[k];
        // 5. loop fm largest freq down to 1, 
        // for each no in freq[i] add to result list, once result has k nos return
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
