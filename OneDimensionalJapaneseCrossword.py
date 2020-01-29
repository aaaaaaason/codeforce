from itertools import groupby

ch_cnt = int(input())
string = input()

tmp = [str(len(tuple(g))) for k, g in groupby(string) if k == 'B']
print(len(tmp))
print(' '.join(tmp))