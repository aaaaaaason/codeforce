from itertools import count
n, m = map(int, input().split())
buy = m
for i in count(1):
    if n == 0:
        print(i-1)
        break
    n -= 1
    if i == buy:
        n += 1
        buy += m
