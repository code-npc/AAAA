"""
   文件操作
   打开文件，关闭文件，读写
"""
import time

# 打开文件
# f = open("C:/Users/HP/Pictures/Saved Pictures/1.txt" , "r" ,encoding="UTF-8")
# print(type(f))
# 读取文件 read()
# print(f.read(11))
# 只要文件打开后，读取文件的时候，第二次读取文件会续接上一次读取的位置
# print(f.read())

# 读取文件 readLines()
# lines = f.readlines()
# print(f"结果是{lines},类型是：{type(lines)}")

# 读取文件 readLine()  一次读取一行

# print(f"第一次：{f.readline()}")
# print(f"第2次：{f.readline()}")
# print(f"第3次：{f.readline()}")

# for循环读取文件行
# for line in f:
#     print(line)
# close() ,关闭文件
# f.close()

with open("C:/Users/HP/Pictures/Saved Pictures/1.txt" , "r" ,encoding="UTF-8") as f:
    lines = f.readlines()
    print(lines)


