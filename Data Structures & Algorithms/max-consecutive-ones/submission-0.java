class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1s = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                counter++;
            }
            else{
                max1s = Math.max(max1s, counter);
                counter = 0;
            }
        }
        return Math.max(max1s, counter);
    }
}