'''
given a list of tuples of movie watched times, find how many unique minutes of the movie did the viewer watch e.g. [(0,15),(10,25)]. The viewer watched 25 minutes of the movie.
'''
# view_time = [(0,15), (10,25)]
view_time = [(0,15), (20,25), (20, 40)]
# sorted ?
# if end time is later than next start time then merger those two start-end time
# (0, 15) (10, 25)
# sum all the watching time

for i in range(len(view_time)-1):
    if view_time[i][1] > view_time[i+1][0]:
        view_time[i+1] = (view_time[i][0], view_time[i+1][1])
        view_time[i] = (0,0)

sum = 0
for view in view_time:
    sum += view[1] - view[0]

print(sum)


