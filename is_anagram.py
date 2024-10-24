# 내가 한것 (바보다...ㅋ)
'''
def find(a, b):
    alpah=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",","]
    count = 0
    

    for x in range (0,len(alpah)):
        if(a.lower().count(alpah[x])==b.lower().count(alpah[x])):
            count += a.lower().count(alpah[x])


    print(count)
    print(len(before.replace(" ","")))
    print(len(after.replace(" ","")))


    if (len(after.replace(" ",""))==len(before.replace(" ",""))) & (count == len(after.replace(" ",""))):
        print("똑같아")
    else:
        print("안똑같아")

before = "i am Lord Voldemort"
after = "Tom Marvolo Riddle"

before = "Ave Maria, gratia plena, Dominus tecum" 
after = "Virgo serena, pia, munda et immaculata"
find(before, after)
'''


# 부학장님이 한 것
def prepare(value):
    result = [x for x in list(value.upper()) if x != " "]
    result.sort()
    return result

def is_anagram(s1, s2):
    val1, val2 = (prepare(s1), prepare(s2))
    if(val1 == val2):
        return True
    else:
        return False

s1 = "Ave Maria, gratia plena, Dominus tecum" 
s2 = "Virgo serena, pia, munda et immaculata"

print(is_anagram(s1,s2))