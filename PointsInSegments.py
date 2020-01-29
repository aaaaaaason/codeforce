
n, m = tuple(map(int, input().split()))
points = [0 for _ in range(m+1)]
isEnd = [0 for _ in range(m+1)]
for i in range(n):
    l, r = tuple(map(int, input().split()))
    points[l] += 1
    points[r] -= 1
    isEnd[l] = isEnd[r] = True

cur, res = 0, []
for i in range(1, m+1):
    if cur == 0 and points[i] == 0 and not isEnd[i]:
        res.append(str(i))
    cur += points[i]
print(len(res))
print(' '.join(res))
