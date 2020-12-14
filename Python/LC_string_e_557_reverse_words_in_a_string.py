
def reverse_words_01(s: str) -> str:
    reversed_words = []
    for word in s.split():
        reversed_words.append(word[::-1])
    return ' '.join(reversed_words)


def reverse_words_02(s: str) -> str:
    reversed_words = []
    for word in s.split():
        reversed_words.append(''.join(reversed(word)))
    return ' '.join(reversed_words)


def reverse_words_03(s: str) -> str:
    reversed_words = []
    for word in s.split():
        i = len(word)
        reversed_word = []
        while i > 0 :
            reversed_word += word[i-1]
            i -= 1
        reversed_words.append(''.join(reversed(word)))
    return ' '.join(reversed_words)

s = 'let_s test 1234'
print(reverse_words_01(s))

s = 'let_s test 1234'
print(reverse_words_02(s))

s = 'let_s test 1234'
print(reverse_words_03(s))
