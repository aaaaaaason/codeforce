
n = int(input())
rows = [input() for _ in range(n)]

def check(rows: list, r: int, c: int) -> bool:
    if rows[r][c] == rows[r][c+1] and rows[r][c] == 'O':
        rows[r] = rows[r][:c] + '++' + rows[r][c+2:]
        return True
    return False

found = False
for i, row in enumerate(rows):
    if check(rows, i, 0) or check(rows, i, 3):
        found = True
        break

if found:
    print('YES')
    for row in rows:
        print(row)
else:
    print('NO')
