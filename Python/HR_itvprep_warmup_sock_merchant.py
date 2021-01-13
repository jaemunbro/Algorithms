#!/bin/python3

import math
import os
import random
import re
import sys

from collections import Counter

# Complete the sockMerchant function below.
def sockMerchant(n, ar):
    # loop n
    # a socks has same color socks in the list,
    # add +1 on sum, remove the socks
    numsocks = Counter(ar)
    # {a:3, b:5}
    sum = 0
    for v in numsocks.values():
        sum += int(v/2)
    return sum


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    fptr.write(str(result) + '\n')

    fptr.close()
