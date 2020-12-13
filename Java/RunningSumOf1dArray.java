class RunningSumOf1dArray02 {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }

    System.out.println(runningSum([1,2,3,4]))
}


//https://leetcode.com/problems/running-sum-of-1d-array/discuss/688613/Java-clean-and-simple-solution

class RunningSumOf1dArray01{
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length ; i++) {
            nums[i] += nums[i-1]
        }
        return nums;
    }
}

