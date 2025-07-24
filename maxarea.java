class maxarea {
    public int maxArea(int[] height) {
        int m = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            m = Math.max(m, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return m;

    }
}