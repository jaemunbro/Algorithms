#p.201

#cut mid
#2
#if longer than the request
#1, 2, 3 = 3
# 1 2 3
# go up
# 3
# 1 + 2 = 3
# if shorter than the request
# go down

# m, n = input().split()
# dducks = map(int, list(input().split()))

# test set
m, n = 4, 3
dducks = [5,6,7,9]

def binary_search(array, target, start, end):
    cutters = []
    while start <= end:
        mid = (start+end) // 2
        output = 0
        print(mid, end = ' ')
        for dduck in array:
            if dduck - mid > 0:
                output += dduck - mid
        print(output)

        if output == target:
            return mid
        elif output > target:
            start = mid + 1
            # needed to be recorded
            cutters.append(mid)
        else:
            end = mid - 1

    return max(cutters)


def set_dduck_machine(m, n, dducks):
    if m == 1:
        return max(dducks) - 1

    setting = binary_search(dducks, target=n, start=0, end=max(dducks))
    return setting

print(set_dduck_machine(m, n, dducks))














