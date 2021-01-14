n = int(input())
c = list(map(int, input().split()))

# n = 7
# c = [0, 0, 1, 0, 0, 1, 0]

step_cnt = 0
pointer = 0
print(step_cnt)
while pointer < n - 1:
    # in case the pointer is on last index or last -1 index
    print(f'step_cnt {step_cnt}')
    print(f'pointer {pointer}')


    if pointer == n - 2:
        step_cnt +=1
        break

    if c[pointer+2] == 1:
        step_cnt += 1
        pointer += 1
    else:
        step_cnt += 1
        pointer += 2

print(step_cnt)