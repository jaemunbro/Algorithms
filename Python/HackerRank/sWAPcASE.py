# 20190716
def swap_case(s):
    list_length = list(s).__len__()
    s = list(s)
    for _ in range(list_length):
        if s[_].isupper():
            s[_] = s[_].lower()
        else:
            s[_] = s[_].upper()

    result = ''.join(s)

    return result


if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
