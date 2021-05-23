'''
p.197
'''

class SolutionBinarySearch:
    # use binary search
    # sort n first
    # loop and find m
    # time complexity : NlogN (sorting) + M * logN (search)
    m = input()
    array = list(map(int, input().split()))

    n = input()
    targets = list(map(int, input().split()))

    array = sorted(array)

    def binary_search(self, array, target, start, end):
        while start <= end:
            mid = (start+end) // 2

            if array(mid) == target:
                return mid
            elif array(mid) > target:
                end = mid - 1
            else:
                start = mid + 1
        return None

    for i in m:
        result = binary_search(array, i, 0, n-1)

        if result != None:
            print('yes', end = ' ')
        else:
            print('no', end = ' ')


# the most optimized and the easiest answer with Set
# Set is implemented with hash table. So Time complexity : O(M)
class SolutionSet:
    m = input()
    array = list(map(int, input().split()))

    n = input()
    targets = list(map(int, input().split()))

    array = set(array)

    for i in n:
        if i in array:
            print('yes')
        else:
            print('no')