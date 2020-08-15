#20190716
def print_full_name(a, b):
    print(f"Hello {a} {b}! You just delved into python.")
    print(("hello %s %s!") % (a, b))



if __name__ == '__main__':
    first_name = input()
    last_name = input()
    print_full_name(first_name, last_name)