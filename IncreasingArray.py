n = int(input())
a = [int(i) for i in input().split()]
cnt = 0
for i in range(len(a)-1):
    while a[i] > a[i+1]:
        diff = abs(a[i]-a[i+1])
        cnt += diff
        a[i+1] += diff
print(cnt)
