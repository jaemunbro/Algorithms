"""
Lists
190706
"""

if __name__ == '__main__':
    n = int(input())
    arr = list()

    for _ in range(n):
        arr_command = input().split()
        arr_command[0]
        arr_command[1:]
        print("command : " + arr_command[0])
        print("numbers : ", arr_command[1:])
        command = arr_command[0]
        joincommand = ','.join(arr_command[1:])
        print("join : ", joincommand)

        if(command != "print"):
            eval("arr." + command + "(" + joincommand + ")")
        else:
            print(arr)


