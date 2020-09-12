'''
11.

 [[A],
  [A,B],
  [A,C],
  [B,D],
  [C,A]]
  -- Find the alphabet with highest neighbors?
'''

'''
loop the list 
if lenth == 2 
  if dict [0]
    take out the value += 1
    put the value into dict again 

  if dict [1]
    take out the value += 1
    put the value into dict again 

loop the dict 
check key/value, when maximum value, then print the key


'''
M = [['A'],
     ['A','B'],
     ['A','C'],
     ['B','D'],
     ['C','A']]

#friend_dic
fdic = {}
for fr in M:
    if len(fr) == 2:
        temp = 0
        if fr[0] in fdic:  # 'A'
            temp = fdic[fr[0]]
            fdic[fr[0]] = temp+1
        else:
            fdic[fr[0]] = 1

        if fr[1] in fdic:  # 'B'
            temp = fdic[fr[1]]
            fdic[fr[1]] = temp+1
        else:
            fdic[fr[1]] = 1



# find max value
##1. loop the dic
maxkey = ''
maxval = 0
for k, v in fdic.items():
    if v > maxval:
        maxval = v
        maxkey = k

print(maxkey)

##2. sorted
sorted_f = sorted(fdic.items(), key = lambda x : x[1], reverse=True)
print(sorted_f)
print(sorted_f[0])

##3. max value from dict
maxf = max(fdic.items(), key = lambda x : x[1])
print(maxf)
