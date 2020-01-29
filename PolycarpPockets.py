from collections import Counter

n = int(input())
c = Counter(input().split())
print(c.most_common()[0][1])
