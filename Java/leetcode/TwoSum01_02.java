package leetcode;

import java.util.*;


/*
 Hash map
 complexity
 Time complexity : O(n^2)
 Space comoplexity : O(1)
*/


public class TwoSum01_02 {

    public static void main(String[] args) {
        int[] testset = {1, 2, 5, 7, 11};
        int testresult = 9;

        TwoSum01_02 TStest = new TwoSum01_02();

        int[] testreturn2 = null;

        testreturn2 = TStest.Twosum(testset, testresult);

        System.out.println("reuslt 1 : " + testreturn2[0]);
        System.out.println("reuslt 2 : " + testreturn2[1]);


    }

    public int[] Twosum(int[] nums, int target) {
        int[] testreturn = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++ ){
            map.put(nums[i], i);
            System.out.println("map.get           : " + map.get(nums[i]));
        }
        for (int i = 0; i < nums.length ; i++){
            int complement = target - nums[i];

            System.out.println("complemnet        : " + complement);
            System.out.println("map.get           : " + map.get(complement));
            System.out.println("map.containsKey   : " + map.containsKey(complement));
            System.out.println("map.containsValue : " + map.containsValue(complement));
            System.out.println("map.containsValue 0 : " + map.containsValue(0));
            System.out.println("====================" );


            if(map.containsKey(complement)){
                testreturn[0] = i;
                testreturn[1] = map.get(complement);
                return testreturn;
            }

        }


        throw new IllegalArgumentException("test argument");


    }
}
