
def main():
    s, n = map(int, input().split())

    dragons = []
    for i in range(n):
        dragons.append(tuple(map(int, input().split())))
    dragons = sorted(dragons, key = lambda x: x[0])

    for ds, bonus in dragons:
        if ds >= s:
            print('NO')
            return
        s += bonus
    print('YES')

if __name__ == '__main__':
    main()
