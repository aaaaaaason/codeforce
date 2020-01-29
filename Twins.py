
n = int(input())
coins = list(map(int, input().split()))
coins = sorted(coins, reverse=True)
my, total = 0, sum(coins)
for i in range(len(coins)):
    my += coins[i]
    total -= coins[i]
    if my > total:
        break
print(str(i+1))

