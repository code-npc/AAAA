# 打印九九乘法表
# a = 1
#
# while a <= 9:
#     b = 1
#     while b <= a:
#         print(f"{b}*{a}={a*b}\t",end='')
#         b += 1
#     print('')
#     a += 1


# 使用for循环实现：打印九九乘法表

for i in range(1,10):

    for j in range(1,i+1):
        print(f"{j}*{i}={i * j}\t", end='')
    print('')