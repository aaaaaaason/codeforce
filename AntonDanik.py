

total = int(input())
res = input()
acnt = res.count('A')
dcnt = total - acnt
if acnt > dcnt:
    print("Anton")
elif acnt == dcnt:
    print('Friendship')
else:
    print('Danik')
