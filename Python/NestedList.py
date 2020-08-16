"""
Nested List
181201

Given the names and grades for each student in a Physics class of  students,
store them in a nested list and print the name(s) of any student(s) having the second lowest grade.

Note: If there are multiple students with the same grade,
order their names alphabetically and print each name on a new line.
"""

if __name__ == '__main__':
    board = list()
    result = list()
    min_score = 100
    second_min_score = 100

    for _ in range(int(input())):

        name = input()
        score = float(input())

        board = list.__add__(board, [[name, score]])
        # board = list.append(board, [name, score])

        temp = board[_][1]

        if temp < min_score:
            second_min_score = min_score
            min_score = temp
        elif temp > min_score and second_min_score > temp:
             second_min_score = temp

    for _ in range(len(board)):
        if board[_][1] == second_min_score:
            result.append(board[_][0])

    result.sort()
    for _ in range(len(result)):
        print(result[_])


