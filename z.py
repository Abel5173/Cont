a, b, c, d = map(int, input().split())
i = 1
lent = 0
if d >= a:
    while (d > 0):
        if i == 1 and d >= a:
            d = d-a
            lent += 1
            i += 1
        elif (i > 1 and i < 11) and d >= b:
            d -= b
            lent += 1
            i += 1
        elif i > 10 and d >= c:
            d -= c
            lent += 1
            i += 1
        else:
            d = 0
            continue
    print(lent)
else:
    print(lent)
