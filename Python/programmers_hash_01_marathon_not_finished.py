'''
programmers coding test kits
hash 01 완주하지 못한 선수
'''
participant = ["leo", "kiki", "eden"]
completion = ["eden", "kiki"]


def solution(participant, completion):
    dict_part = dict()
    for name in participant:
        if dict_part.get(name):
            dict_part[name] = dict_part[name] + 1
        else:
            dict_part[name] = 1

    for name in completion:
        if dict_part.get(name):
            if dict_part[name] > 1:
                dict_part[name] = dict_part[name] - 1
            else:
                dict_part.pop(name)

    answer = dict_part.popitem()
    return answer[0]


print(solution(participant, completion))


def solution_counter(participant, completion):
    pass
