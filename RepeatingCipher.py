
n = int(input())
s = input()

i, step, res = 0, 1, []
while i < len(s):
    res.append(s[i])
    i += step
    step += 1
print(''.join(res))