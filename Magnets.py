
cnt = int(input())

gcnt, cur = 1, input()
for i in range(1, cnt):
    tmp = input()
    if cur != tmp:
        gcnt += 1
        cur = tmp
print(gcnt)