# 20190721
# In the first line, print True if  has any alphanumeric characters. Otherwise, print False.
# In the second line, print True if  has any alphabetical characters. Otherwise, print False.
# In the third line, print True if  has any digits. Otherwise, print False.
# In the fourth line, print True if  has any lowercase characters. Otherwise, print False.
# In the fifth line, print True if  has any uppercase characters. Otherwise, print False.

if __name__ == '__main__':
    s = input()
    alnum = False
    alpha = False
    digit = False
    lower = False
    upper = False

    for i in range(0, len(s)):
        if s[i].isalnum():
            alnum = True

        if s[i].isalpha():
            alpha = True

        if s[i].isdigit():
            digit = True

        if s[i].islower():
            lower = True

        if s[i].isupper():
            upper = True

    print(alnum)
    print(alpha)
    print(digit)
    print(lower)
    print(upper)