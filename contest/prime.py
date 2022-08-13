def isPrime(n):
    if (n <= 1):
        return False
    if (n % 2 == 0):
        return False
    for i in range(3, int(n**0.5 + 1), 2):
        if (n % i == 0):
            return False
    return True


n = int()
while True:
    n = int(input())
    if n != -1:
        if isPrime(n):
            if n % 10 == 3:
                print(n, 'YES')
            else:
                print(n, 'NO')
        else:
            b = False
            a = n
            for i in range(2, a + 1):
                if(a % i == 0):
                    isprime = 1
                    for j in range(2, (i // 2 + 1)):
                        if(i % j == 0):
                            isprime = 0
                            break

                    if (isprime == 1):
                        if i % 10 == 3:
                            b = True
                        else:
                            b = False
            if b:
                print(n, 'YES')
            else:
                print(n, 'NO')
    else:
        break
