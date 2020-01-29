
import functools

cnt = int(input())
rounds = [list(map(int, input().split())) for i in range(cnt)]

res = functools.reduce(lambda p, c: p + 1 if c[0] > c[1] else \
    p if c[0] == c[1] else p - 1, rounds, 0)

if res > 0:
    print('Mishka')
elif res == 0:
    print('Friendship is magic!^^')
else:
    print('Chris')

