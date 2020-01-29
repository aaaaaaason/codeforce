
import functools

cnt = int(input())
arr = list(map(int, input().split()))
maxi = max(arr)

print(functools.reduce(lambda r, c: r + maxi - c, arr, 0))