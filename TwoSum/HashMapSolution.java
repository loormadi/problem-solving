class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
                int[] result = {map.get(needed), i};
                return result;
            }

            map.put(nums[i], i);
        }
        
        return new int[]{};

        
    }
}
