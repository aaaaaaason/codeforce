
n = int(input())
for i in range(n):
    want = int(input())
    if want % 2 == 0:
        print(want//2)
    else:
        print(str(1 + (want-3)//2))