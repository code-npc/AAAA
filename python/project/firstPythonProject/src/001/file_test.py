"""
统计文件中 某个字符出现的次数
"""
from fileinput import close
# with open("D:/world.txt") as f:
#     lines = f.read()
#     ref = lines.count("12")
#     print(ref)



f1 = open("D:/world.txt","r",encoding="UTF-8")
f2 = open("D:/world222.txt","w",encoding="UTF-8")

for line in f1:
 if line.find("91"):
  f2.write(line)

f2.close()
f1.close()