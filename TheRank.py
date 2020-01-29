from functools import reduce

total = int(input())
thomas = sum(tuple(map(int, input().split())))
higher = reduce(lambda r, c: r + 1 if sum(tuple(map(int, input().split()))) > thomas else r, range(total-1), 0)
print(higher+1)
