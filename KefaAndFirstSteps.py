
n = int(input())
nums = list(map(int, input().split()))

pre, cur_cnt, cur_max = nums[0], 1, 1
for i in range(1, len(nums)):
    if nums[i] >= pre:
        cur_cnt += 1
    else:
        cur_max = max(cur_max, cur_cnt)
        cur_cnt = 1
    pre = nums[i]

cur_max = max(cur_max, cur_cnt)
print(cur_max)