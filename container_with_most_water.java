class container_with_most_water {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int smallerside = Math.min(height[left], height[right]);
            int currarea = (right-left) * smallerside;
            maxarea = Math.max(maxarea, currarea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }
}