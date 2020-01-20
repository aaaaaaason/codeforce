
for i in range(5):
    l = input().split()
    for j in range(5):
        if l[j] == '1':
            print(abs(2 - i) + abs(2 - j))