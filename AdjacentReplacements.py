
n = int(input())

def trans(x: str)-> str:
    num = int(x)
    return str(num) if num % 2 == 1 else str(num - 1)

res = [*map(trans, input().split())]
print(' '.join(res))
