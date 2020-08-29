class Solution:

    def uniqueMorseRepresentations(self, words):
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        morse_dict = dict()

        for word in words:
            morse_word = ''

            for i in range(len(word)):
                char = word[i]
                morse_word = morse_word + morse[ord(char) -96 -1]

            if morse_word in morse_dict:
                morse_dict[morse_word] = morse_dict[morse_word] + 1
            else:
                morse_dict[morse_word] = 1
        print(morse_dict)
        print(len(morse_dict))
        return len(morse_dict)