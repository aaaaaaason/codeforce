#!/usr/bin/python3

import sys

outer_size, inner_size = map(int, input().split())
outer = input().split()
inner = input().split()

for i in range(int(input())):
    year = int(input())
    ostr = outer[year % outer_size  - 1]
    istr = inner[year % inner_size - 1]
    print(ostr + istr)
