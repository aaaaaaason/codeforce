
import functools

cals = [*map(int, input().split())]
steps = input()

print(functools.reduce(lambda r, n: r + cals[int(n)-1], steps, 0))