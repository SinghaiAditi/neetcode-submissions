class Solution {
    public int removeElement(int[] nums, int val) {
        // two pass solution

        int k = nums.length;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i]==val) {
                k--;
                nums[i]=-1;
            }
        }

        int lastIndex = nums.length-1;
        int lastHold = -1;

        int i = nums.length-1;
        while(i >= 0) { // 6 // 5 // 4 // 3
            int curr = nums[i];
            
            if(lastIndex >= 0 && curr == -1) {
                nums[i] = nums[lastIndex];
                nums[lastIndex] = -1;
                lastIndex--;
            }

            i--;
        }

        return k;

    }
}