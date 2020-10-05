# binary sum with carry
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a = list(a)
        b = list(b)

        sum = []
        carry = 0
        while a or b or carry:
            if a and b:
                digit_sum = int(a.pop()) + int(b.pop()) + carry
            elif a:
                digit_sum = int(a.pop()) + carry
            elif b:
                digit_sum = int(b.pop()) + carry
            else:
                digit_sum = carry

            carry = 0
            if digit_sum == 3:
                sum.insert(0, '1')
                carry = 1
            elif digit_sum == 2:
                sum.insert(0, '0')
                carry = 1
            else:
                sum.insert(0, str(digit_sum))

        return(''.join(sum))


# change it to decimal
class Solution02:
    def addBinary(self, a: str, b: str) -> str:
        dec_a, dec_b = 0, 0

        for i, num in enumerate(reversed(a)):
            # 1 2 4 8 16 . ..
            if num == '1':
                dec_a += 2 ** (i)
        a = dec_a

        for i, num in enumerate(reversed(b)):
            # 1 2 4 8 16 . ..
            if num == '1':
                dec_b += 2 ** (i)
        b = dec_b

        return str(bin(dec_a + dec_b))[2:]





















