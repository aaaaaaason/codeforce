
cnt = int(input())
locs = input()

pre, sf, fs = locs[0], 0, 0
for i in range(1, len(locs)):
    if pre != locs[i]:
        if locs[i] == 'S':
            fs += 1
        elif locs[i] == 'F':
            sf += 1
    pre = locs[i]

print("YES") if sf > fs else print("NO")
