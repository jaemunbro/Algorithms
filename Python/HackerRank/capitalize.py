#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve01(s):
    splitted = s.split()
    name = ""
    for i in range(0, splitted.__len__()):
        # print(splitted[i][0].upper(), end= '')
        # print(splitted[i][1:], end = " ")
        s = s.replace(splitted[i], splitted[i][0].upper()+splitted[i][1:])
    return s


# NOTE!
# Easier version
def solve02(s):
    for x in s[:].split():
        s = s.replace(x, x.capitalize())

    return s


if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    # wrong. cuz there's case like "hello   world  lol"
    result = solve01(s)

    # fptr.write(result + '\n')
    #
    # fptr.close()
