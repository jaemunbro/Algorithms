#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'countingValleys' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER steps
#  2. STRING path
#

def countingValleys(steps, path):
    # Write your code here
    valley_cnt = 0
    alt = 0
    # add 1 valley count when altitude goes from 0 to -1
    for char in path:
        if char == 'U':
            alt += 1
        else:
            alt -= 1
            if alt == -1:
                valley_cnt += 1

    return valley_cnt



if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    steps = int(input().strip())

    path = input()

    result = countingValleys(steps, path)

    fptr.write(str(result) + '\n')

    fptr.close()
