
n = int(input())
nums = sorted(list(map(int, input().split())))

ret = 0
for i in range(0, len(nums), 2):
    ret += nums[i+1] - nums[i]
print(ret)
