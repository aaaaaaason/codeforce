
import itertools

n = int(input())
arr = [[0 for _ in range(n)] for _ in range(n)]

for i in range(n):
    arr[0][i] = arr[i][0] = 1

for i, j in itertools.product(range(1, n), range(1, n)):
    arr[i][j] = arr[i-1][j] + arr[i][j-1]

print(arr[-1][-1])
