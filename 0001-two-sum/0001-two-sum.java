class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();

        int res[] = new int[2];
        for(int i=0; i<nums.length; i++){
            if(m.containsKey(target-nums[i])){
                res[0] = m.get(target-nums[i]);
                res[1] =i;
                break;
            }
            m.put(nums[i], i);
        }
        return res;
    }
}