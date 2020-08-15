def word_count(s):
    s = s.split(" ")
    dict_wc = dict()
    for word in s:
        if word in dict_wc:
            dict_wc[word] += 1
        else:
            dict_wc[word] = 1
    print(dict_wc)

if __name__ == '__main__':
    s = 'the monkey goes to the monkey tree'
    word_count(s)

"""
time complexity : O(n)
space complexity : O(1)
"""




