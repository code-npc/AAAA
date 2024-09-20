
# for k in range(10):
#     print(k)

# for k in range(2,8):
#     print(k)

# 从1开始，步长为3，步长默认为1；
# for k in range(1,10,3):
#     print(k)


def fun(com):
    result = com(2,34)
    return result

def com(x,y):
    return x+y

print(f"结果：{fun(com)},类型{type(com)}")