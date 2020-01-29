
n = int(input())

cnt, out = 0, ''
if n % 2 == 1:
    n, cnt, out = n-3, 1, '3 '

print(str(cnt + n//2))
print(out + " ".join(['2' for _ in range(n//2)]))
