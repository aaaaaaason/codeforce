
cnt = int(input())
for i in range(cnt):
    n, x, a, b = tuple(map(int, input().split()))
    print(min(n-1, abs(a-b) + x))