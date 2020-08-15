#20190720
def count_substring(string, sub_string):
    temp_count = 0

    # for j in range(0, len(string)+1-len(sub_string)):
    #     temp_list = []
    #
    #     for i in range(j, j + len(sub_string)):
    #         temp_list.append(string[i])
    #
    #     print("-----------------")
    #     print("string : " + string)
    #     print("temp : " + ''.join(temp_list))
    #     print("sub : " + sub_string)
    #
    #     if ''.join(temp_list) == sub_string:
    #         temp_count = temp_count + 1

### better answer : one loop. you can extract chars from string like array.

    for i in range(0, len(string) + 1 - len(sub_string)):
        if string[i:i+len(sub_string)] == sub_string:
            temp_count += 1

    return temp_count


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string, sub_string)
    print(count)