from itertools import groupby

n = int(input())
name = input()

parse = [max(0, len(tuple(g)) - 2) for k, g in groupby(name) if k == 'x']
print(sum(parse))

