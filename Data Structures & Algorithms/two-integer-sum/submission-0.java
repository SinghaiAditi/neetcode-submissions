class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target-num;
            if(map.containsKey(diff)) {
                int j = map.get(diff);
                return new int[]{j, i};
            }else {
                map.put(num, i);
            }
        }

        return new int[]{};
    }
}
