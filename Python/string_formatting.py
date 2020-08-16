# 20190727
# https://mkaz.blog/code/python-string-format-cookbook/

def print_formatted(number):
    # your code goes here
        # 1 8 16 2
        # octal
        # Hexadecimal
        # Binary
        # this wasn't working cuz there's prefix.
        # print(i, oct(i),  hex(i),  bin(i))

        # fail. need a width.
        #print(i, format(i,'o'), format(i, 'X'), format(i, 'b'))
    # width = len("{0:b}".format(number))
    # for i in range(1, number + 1):
    #     print("{0:{width}d} {0:{width}o} {0:{width}X} {0:{width}b}".format(i, width=width))

    width = len("{0:b}".format(number))

    for i in range(1, number + 1):
        print("{0:{width}d} {0:{width}o} {0:{width}X} {0:{width}b}".format(i, width=width))



if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
