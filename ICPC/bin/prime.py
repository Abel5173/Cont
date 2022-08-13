import math
from turtle import right  
def prime_factors(num):  
    while num % 2 == 0:  
        print(2)  
        num = num / 2  
    for i in range(3, int(math.sqrt(num)) + 1, 2):  
        while num % i == 0:  
            print(i)  
            num = num / i  
    if num > 2:  
        last=int(num)
        print(last)  
right=True
while right:
    num=int(input())
    if num==-1:
        right=False
    else:
      prime_factors(num)  