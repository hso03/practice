# 탭이 2번 된 단어 찾기
with open("words.txt", mode = "r", encoding="UTF-8") as file:
    lst = [x for x in file.readlines()]

for line in lst:
    if "\t\t" in line:
        print(line)


#잘못된 단어 갯수
word_in_problem = [x for x in lst if "\t\t" in x]
print(len(word_in_problem))

#탭이 없는 단어
for line in lst:
    if "\t" not in line:
        print(line)


# 탭 2번된것을 1번으로 변경
i = 0
for line in lst:
    lst[i] = line.replace("\t\t", "\t")
    i += 1

#정상적인 파일 생성....
with open("words_1.txt", mode = "w", encoding="UTF-8") as file:
    file.writelines(lst)