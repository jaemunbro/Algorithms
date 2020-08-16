# 20190716
def mutate_string(string, position, character):
    s = list(string)
    print(type(s))
    print(s)
    s[position] = character
    s2 = ''.join(s)
    print(s2)

    #another option
    s3 = string[:position] + character + string[position + 1:]
    print(s3)
    return s2


if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)