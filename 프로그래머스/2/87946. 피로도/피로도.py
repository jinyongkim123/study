from itertools import permutations
def solution(k, dungeons):
    answer = []
    cases = list(permutations(dungeons))
    
    for i in cases:
        cnt = 0
        hp = k
        for j in i:
            if j[0] <= hp:
                cnt += 1
                hp -= j[1]
        answer.append(cnt)
    print(max(answer))
    return max(answer)