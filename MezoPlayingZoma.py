
n = int(input())
cmds = input()
l = r = 0
for c in cmds:
    if c == 'L':
        l += 1
    else:
        r += 1
print(str(l+r+1))

