def solution(angle):
    if(0<angle & angle<90):
        angle = 1
    elif(angle==90):
        angle = 2
    elif(90 < angle & angle<180):
        angle = 3
    elif(angle == 180):
        angle = 4
            
    return angle