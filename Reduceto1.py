#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'minStepsToOne' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER N as parameter.
#

def minStepsToOne(N):
    # Write your code here
    if(N==1):
        return 0;
    elif(N%2==0):
        return 1+ minStepsToOne(N/2);
    else:
        return 1+ min(minStepsToOne(N-1), minStepsToOne(N+1));

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    N = int(input().strip())

    result = minStepsToOne(N)

    fptr.write(str(result) + '\n')

    fptr.close()

