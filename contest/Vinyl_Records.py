import math

n = int(input())
l = list(map(int, input().split()))
l.sort(reverse=True)
s = 0
for i in range(1, n+1, 2):
    if i < n:
        s += (math.pi*(l[i-1]**2)-math.pi*(l[i]**2))
    else:
        s += math.pi*(l[i-1]**2)
print("{:.6f}".format(s))
