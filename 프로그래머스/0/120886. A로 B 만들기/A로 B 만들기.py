def solution(before, after):
    before_dict = {}
    after_dict = {}
    
    for i in before:
        if i in before_dict:
            before_dict[i] += 1
        if i not in before_dict:
            before_dict[i] = 1
            
    for i in after:
        if i in after_dict:
            after_dict[i] += 1
        if i not in after_dict:
            after_dict[i] = 1
    
    if after_dict == before_dict:
        return 1
    return 0
    
    
    
    