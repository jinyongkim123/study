from itertools import combinations, permutations
def solution(spell, dic):
    lists = []
    for i in permutations(spell, len(spell)):
        lists.append(''.join(i))
    
    for i in dic:
        if i in lists:
            return 1
    return 2