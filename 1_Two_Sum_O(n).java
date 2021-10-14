class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] r = new int[2];
        for(int i = 0;i < nums.length;i++) {
            if(m.containsKey(nums[i])) {
                int id = m.get(nums[i]);
                r[0] = id;
                r[1] = i;
                return r;
            }
            else{
                m.put(target - nums[i], i);
            }
        }
        return r;
    }
}