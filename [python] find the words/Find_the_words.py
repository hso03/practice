dic = {} # dicitionary 생성

# file 찾기 , file로 변수 이름 생성
with open("words.txt", mode = "r" , encoding="UTF-8") as file:
    for line in file.readlines():
        dic[line.split(".")[1].split("\t")[0].strip()] = line.split(".")[1].split("\t")[1].strip()


while(True):
    word = input("Enter a word : ")
    if(word == "exit()"):
        break
    else:
        print(dic[word])