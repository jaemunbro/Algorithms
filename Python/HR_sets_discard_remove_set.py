# Enter your code here. Read input from STDIN. Print output to STDOUTn input
n = int(input())
s = set(map(int, input().split()))
N = int(input())

for i in range(N):
    command = list(input().split())
    # print(s)
    if len(command) == 2:
        eval(f's.{command[0]}({command[1]})')
    else:
        eval(f's.{command[0]}()')

    # print(command)
    # print(s)

print(sum(s))
