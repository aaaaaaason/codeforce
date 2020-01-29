
n = int(input())

for i in range(n):
    a, b, k = (map(int, input().split()))
    if k % 2 == 1:
        print(str( a + (a-b)*(k-1)//2 ))
    else:
        print(str( (a-b)*k//2 ))