# words = ["hello","leetcode"]
# order = "hlabcdefgijkmnopqrstuvwxyz"

# words = ["word","world","row"] 
# words = ["apple","app"]
words = ["app", "apple"]
order = "worldabcefghijkmnpqstuvxyz"

def check_order(words, order):
    # loop all thew words
    for i in range(len(words) - 1):
        shorter_len = min(len(words[i]), len(words[i+1]))
        # compare each words
        if words[i][:shorter_len] == words[i+1][:shorter_len]:
            if len(words[i]) > len(words[i+1]):
                return False

        for j in range(shorter_len):
            if order.index(words[i][j]) < order.index(words[i+1][j]):
                print(j)
                print(words[i][j] + ' + ' + words[i+1][j])
                break

            # word < world
            if order.index(words[i][j]) > order.index(words[i+1][j]):
                return False

    return True


print(check_order(words, order))



