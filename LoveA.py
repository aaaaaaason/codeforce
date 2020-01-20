

s = input()

acnt = s.count('a')
non_acnt = len(s) - acnt

if non_acnt >= acnt:
    print(str(acnt+acnt-1))
else:
    print(len(s))