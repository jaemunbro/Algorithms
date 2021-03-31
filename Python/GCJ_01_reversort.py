'''
Qualification Round 2021 - Code Jam 2021
Reversort (7pts)
'''
T = input()
cases = []
for i in range(int(T)):
  N = input()
  case = list(map(int, input().split()))
  cases.append(case)

# case = [4,2,1,3]

def reversort(case):
    cost = 0

    # position 찾기
    for i in range(1, len(case)):
        print('i = ' + str(i))
        # sublist sorting
        for j in range(i-1, len(case)):
            print('j = ' + str(j))
            cost += 1
            print('cost = ' + str(cost))
            if i == case[j]:
                sublist = case[i-1:j+1]
                print(sublist)
                sublist.sort()
                case[i-1:j+1] = sublist
                print(case)
                break

    return cost


def reversort_tried01(case):
    cost = 0

    # position 찾기
    for i in range(1, len(case)-1):
        print('i = ' + str(i))
        #for j, idx in enumerate(case):
        for j in range(i-1, len(case)):
            print('j = ' + str(j))
            cost += 1
            print('cost = ' + str(cost))
            if i == case[j]:
                case[i-1], case[j] = case[j], case[i-1]
                print(case)
                break

# reversort(case)
# print(reversort(case))
for i in range(len(cases)):
  cost = reversort(cases[i])
  print('Case #' + str(i+1) + ': ' + str(cost))









