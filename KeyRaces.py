
c, fv, sv, fp, sp = tuple(map(int, input().split()))

f, s = c*fv + 2*fp, c*sv + 2*sp
print('First') if f < s else \
    print('Friendship') if f == s else print('Second')