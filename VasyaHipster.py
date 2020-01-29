
blue, red = map(int, input().split())

a1 = min(blue, red)
a2 = (blue - a1) // 2 + (red - a1) // 2
print('{} {}'.format(a1, a2))