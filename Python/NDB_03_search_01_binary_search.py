n, target = list(map(int, input().split()))
array = list(map(int, input().split()))

def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2

        if array[mid] == target:
            return mid
        elif array[mid] > target:
            end = mid - 1
        else:
            start = mid + 1

    # if while loop ends, return None
    return None


result = binary_search(array, target, 0, n-1)
if result == None:
    print('no element')
else:
    print()



# better without start,end arguments
def binary_search(array, target):
    start = array[0]
    end = array[-1]

    # this two statements are key
    while start <= end:
        mid = (start + end) // 2

        if array[mid] == target:
            return mid
        elif array[mid] < target:
            start = mid+1
        else:
            end = mid-1

    return None
