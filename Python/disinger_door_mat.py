def draw(sizeN, sizeM):
    for i in range(1, int(sizeN/2)+1):
        sign = ".|." * (i * 2 - 1)
        dash = '-' * int((sizeM - len(sign)) / 2)
        print(dash + sign + dash)

    print('-' * int((sizeM - 7) / 2) + 'WELCOME' + '-' * int((sizeM - 7) / 2))

    for i in range(int(sizeN/2), 0, -1):
        sign = ".|." * (i * 2 - 1)
        dash = '-' * int((sizeM - len(sign)) / 2)
        print(dash + sign + dash)

if __name__ == '__main__':
    size = input()
    sizeN, sizeM = size.split()

    draw(int(sizeN), int(sizeM))
