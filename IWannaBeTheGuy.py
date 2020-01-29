
n = int(input())

count = [False for _ in range(n+1)]
count[0] = True

for l in range(2):
    x = list(map(int, input().split()))
    for i in range(1, len(x)):
        count[x[i]] = True

cant_pass_num = count.count(False)
print("I become the guy.") if cant_pass_num == 0 else \
    print("Oh, my keyboard!")