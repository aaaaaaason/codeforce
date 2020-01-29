
import functools

total, fence = map(int, input().split())
people = map(int, input().split())

cnt = functools.reduce(lambda r, e: r + 2 if e > fence else r + 1, people, 0)
print(cnt)