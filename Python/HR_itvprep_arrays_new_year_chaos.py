# Enter your code here. Read input from STDIN. Print output to STDOUT

t = int(input())
for i in range(t):
    num_ppl = int(input())
    n = list(map(int, input().split()))

    # org_line = list(range(1,num_ppl+1))
    # for i in range(1,num_ppl+1):
    #     org_line.append(i)

    sum = 0
    for idx, num in enumerate(n):
        # result = org_line.index(num) - idx

        if num - (idx + 1) >= 3:
            sum = 'Too chaotic'
            break

        for j in n[max(num-2, 0):idx]:
            if j > num:
                sum += 1

    print(sum)
