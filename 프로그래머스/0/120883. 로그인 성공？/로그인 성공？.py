def solution(id_pw, db):
    # if id_pw in db:
    #     return "login"
    # for i in db:
    #     if id_pw[0] == i[0]:
    #         if id_pw[1] != i[1]:
    #             return "wrong pw"
    # return "fail"
    dic = dict(db)
    if dic.get(id_pw[0], "없음") == id_pw[1]:
        return "login"
    elif dic.get(id_pw[0], "없음") == "없음":
        return "fail"
    return "wrong pw"