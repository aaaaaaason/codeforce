import math
n = int(input())
for _ in range(n):
    a, b, c, d, k = tuple(map(int, input().split()))
    pen_cnt = math.ceil(a/c)
    pencil_cnt = math.ceil(b/d)
    print('{} {}'.format(pen_cnt, pencil_cnt)) if k >= pen_cnt + pencil_cnt else print(-1)