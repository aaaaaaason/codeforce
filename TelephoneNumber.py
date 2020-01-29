
n = int(input())
for i in range(n):
    nl = int(input())
    seq = input()
    try:
        idx = seq.index('8')
    except:
        idx = nl
    print('YES') if idx + 10 < nl else print('NO')