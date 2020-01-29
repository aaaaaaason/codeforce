
from math import ceil

n, k = map(int, input().split())
odd_cnt = ceil(n/2)
if k <= odd_cnt:
    print(str(1+2*(k-1)))
else:
    print(str(2*(k-odd_cnt)))
