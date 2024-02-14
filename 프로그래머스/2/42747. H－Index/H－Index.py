def solution(citations):
    citations.sort(reverse=True)

    for i in range(len(citations)):
        cnt = i + 1 # h번 이상 인용된 논문 편 갯수.. 1편부터 시작
        if(citations[i] < cnt): 
            return i
        
    return len(citations)