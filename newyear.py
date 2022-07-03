#!/bin/python3

import math
import os
import random
import re
import sys

def swap(q,x,y):
    temp = q[x]
    q[x]=q[y]
    q[y]=temp
    return q

def minimumBribes(q):
    # Write your code here
    bribes =[]
    total=0
    chaoticFlag=False
    for x in reversed(list(enumerate(q))):
        print(x)
        # if x != i+1:
        #     if(x== q[i+1]):
        #         q=swap(q,i,i+1)
        #         total+=1
        #     elif(x== q[i+2]):
        #         q=swap(q,i,i+1)
        #         q=swap(q,i+1,i+2)
        #         total+=1
        #     else:
        #         chaoticFlag=True
        #         break
        
    print('Too chaotic') if chaoticFlag else print(total)
    
if __name__ == '__main__':
    t = int(input().strip())
    for t_itr in range(t):
        n = int(input().strip())

        q = list(map(int, input().rstrip().split()))

        minimumBribes(q)
