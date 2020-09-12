# flatten list
nl = [[180.0, 1, 2, 3], [173.8], [164.2], [156.5], [147.2], [138.2]]

## list comprehension
fl = [v for sublist in nl for v in sublist]
print(fl)

## for loop
result = []
for sublist in nl:
    for v in sublist:
        result.append(v)
print(result)

# if more than 2 level? use recursive.. check flatten dict
