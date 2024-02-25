# def solution(strlist):
#     answer = []
#     for i in strlist:
#         cnt = 0
#         for j in i:
#             cnt += 1
#         answer.append(cnt)
#     return answer

# def solution(strlist):
#     answer =[]
#     for i in strlist:
#         answer.append(len(i))
#     return answer

def solution(strlist):
    return [len(str) for str in strlist]
