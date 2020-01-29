
total = int(input())
to = list(map(int, input().split()))

res = [0 for i in range(total)]
for i in range(total):
    res[to[i]-1] = str(i+1)
print(' '.join(res))

