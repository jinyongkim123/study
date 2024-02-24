def solution(genres, plays):
    genrestotal = {}
    genresnumbering = []
    
    
    for i in range(len(genres)):
        if genres[i] in genrestotal:
            genrestotal[genres[i]] += plays[i]
        else:
            genrestotal[genres[i]] = plays[i]
    
    for i in range(len(genres)):
        genresnumbering.append([i, genres[i], plays[i]])
    
    genrestotal = sorted(genrestotal, key = genrestotal.get, reverse=True)
    genresnumbering = sorted(genresnumbering, key = lambda x : x[2], reverse = True)
    
    answer = []
    
    for i in genrestotal:
        cnt = 0
        for j in range(len(genresnumbering)):
            if i == genresnumbering[j][1]:
                cnt += 1
                if cnt == 3:
                    break
                answer.append(genresnumbering[j][0])
    return answer           
#     print(genrestotal)
#     print(genresnumbering)
#     print(answer)
    
    
    

    