
n, m = map(int, input().split())
d = sorted(list(map(int, input().split())))
res = min([d[i] - d[i-n+1] for i in range(n-1, m)])
print(res)