#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the rotLeft function below.
from collections import deque

# Complete the rotLeft function below.
### with deque
def rotLeft(a, d):
    queue = deque(a)
    for i in range(d):
        queue.append(queue.popleft())

    return list(queue)

### with list
def rotLeft2(a, d):
    for i in range(d):
        a.append(a.pop(0))
    return list(a)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nd = input().split()

    n = int(nd[0])

    d = int(nd[1])

    a = list(map(int, input().rstrip().split()))

    result = rotLeft(a, d)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
