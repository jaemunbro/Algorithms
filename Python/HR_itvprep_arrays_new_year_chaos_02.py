#TODO
# with bubble sort
def NewYearChaos(queue):
    lastIndex = len(queue) - 1
    swaps = 0
    swaped = False

    # check if the queue is too chaotic
    for i, v in enumerate(queue):
        if (v - 1) - i > 2:
            return "Too chaotic"

    # '1 2 5 3 7 8 6 4'
    # bubble sorting to find the answer
    for i in range(0, lastIndex):
        for j in range(0, lastIndex):
            #comps += 1
            if queue[j] > queue[j+1]:
                queue[j], queue[j+1] = queue[j+1], queue[j]
                swaps += 1
                swaped = True

        if swaped:
            swaped = False
        else:
            break
    return swaps



t = 1
num_ppl = 8
n =  list(map(int, '1 2 5 3 7 8 6 4'.split()))
#1 2 3 4 5 6 7 8

for i in range(t):
    swaps = NewYearChaos(n)
    print(swaps)