
n = int(input())

for _ in range(n):
    b, p, f = (map(int, input().split()))
    h, c = (map(int, input().split()))

    fc, sc = (p, f) if h >= c else (f, p)
    fp, sp = (h, c) if h >= c else (c, h)

    out = 0
    min_fc = min(b//2, fc)
    out += fp * min_fc
    b -= 2 * min_fc
    min_sc = min(b//2, sc)
    out += sp * min_sc
    print(out)