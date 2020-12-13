import itertools
from itertools import accumulate

nums = [1,2,3,4]

def runningSum(nums):
    runningsum = []
    sum = 0
    for i in range(len(nums)):
        sum += nums[i]
        runningsum.append(sum)
    return runningsum


def runningSum02(nums):
    for i in range(1,len(nums)):
        nums[i] += nums[i-1]
    return nums

def runningSum03(nums):
    return accumulate(nums)


nums = [1,2,3,4]
print(runningSum(nums))
nums = [1,2,3,4]
print(runningSum02(nums))
nums = [1,2,3,4]
print(runningSum03(nums))