
n = int(input())
steps = list(map(int, input().split()))

res = []
for i in range(len(steps)-1):
    if steps[i] >= steps[i+1]:
        res.append(str(steps[i]))
res.append(str(steps[-1]))
print(len(res))
print(' '.join(res))