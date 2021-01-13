n = input()
# sample n = 'a1'

col = n[0]
row = int(ord(n[1])) - int(ord('a')) + 1

options = [
    (-2, -1), (-1, -2), (1, -2), (2, -1), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)
]

result = 0
for option in options:
    next_row = row + option[1]
    next_col = col + option[0]
    if next_row >= 1 and next_row <=8 and next_col >= 1 and next_col <= 8:
        result += 1

print(result)










