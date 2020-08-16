package leetcode;
/*
 brutal way

 complexity
 Time complexity : O(n^2)
 Space comoplexity : O(1)
*/
public class TwoSum01_01 {
        int[] nums = {2, 3, 7, 11, 15};

        int target = 9;

        public static void main(String args[]){
            TwoSum01_01 TS = new TwoSum01_01();
            int[] results = TS.twoSum(TS.nums, TS.target);

            System.out.println("Test : " + results[0]);
            System.out.println("Test : " + results[1]);

        }

        public int[] twoSum(int[] nums, int target) {
            int[] resultnums = new int[2];
            System.out.println("nums.length : " + nums.length);

            for(int i=0;i<nums.length;i++){
                System.out.println("for nums[i] : " + nums[i]);

                for(int j=i+1;j<nums.length;j++){
                    System.out.println("for nums[j] : " + nums[j]);

                    if(i != j && nums[i] + nums[j] == target){
                        System.out.println("nums[i] : " + nums[i]);
                        System.out.println("nums[j] : " + nums[j]);

                        resultnums[0] = i;
                        resultnums[1] = j;

                        return resultnums;
                    }

                    }

            }

            throw new IllegalArgumentException("no arguments");

        }

}
