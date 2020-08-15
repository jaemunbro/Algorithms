# 20190716
def split_and_join(line):
    # write your code here
    s = '-'.join(line.split(' '))
    return s

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)