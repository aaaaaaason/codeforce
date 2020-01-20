

tar = int(input())
ret = tar // 5
if tar % 5 > 0:
    ret += 1
print(ret)