if __name__ == '__main__':
    n = int(input())
    integer_list = tuple(map(int, input().split()))
    # integer_tuple = (integer_list[0],integer_list[1])
    print(type(integer_list))
    print(hash(integer_list))

