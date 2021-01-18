#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the hourglassSum function below.
def hourglassSum(arr):
    # !!! watch out for initial setting of biggest_sum.
    # should consider the numbers smaller than 0.
    biggest_sum = -99
    # always smaller than 6
    for i in range(4):
        for j in range(4):
            sum_hourglass = arr[0+i][0+j] + arr[0+i][1+j] + arr[0+i][2+j] + arr[1+i][1+j] + arr[2+i][0+j] + arr[2+i][1+j] + arr[2+i][2+j]
            if sum_hourglass > biggest_sum:
                biggest_sum = sum_hourglass

    return biggest_sum


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = hourglassSum(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
