from math import sqrt, floor

def is_lucky(num: int)-> bool:
    while num > 0:
        if num % 10 != 4 and num % 10 != 7:
            return False
        num //= 10
    return True

def main():
    n = int(input())
    for i in range(1, floor(sqrt(n))+1):
        if n % i == 0 and (is_lucky(i) or is_lucky(n//i)):
            print('YES')
            return
    print('NO')


if __name__ == '__main__':
    main()